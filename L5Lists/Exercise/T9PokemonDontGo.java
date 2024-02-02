package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T9PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distanceList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        //повтарящо действие
        //спираме:растоянита свършат
        //продължаваме:имаме растояния между покоменоте

        int sumOfRemoved = 0;
        while (distanceList.size()>0){
            int index = Integer.parseInt(scanner.nextLine());
            //<0
            if (index <0){
                int firstElement = distanceList.get(0);
                int lastElement = distanceList.get(distanceList.size()-1);
                distanceList.set(0,lastElement);
                sumOfRemoved+=firstElement;
                modifyList(distanceList,firstElement);

                //>от последния
            }else if(index > distanceList.size()-1){
                int firstElement = distanceList.get(0);
                int lastElement = distanceList.get(distanceList.size()-1);
                distanceList.set(distanceList.size()-1, firstElement);
                sumOfRemoved+=lastElement;
                modifyList(distanceList, lastElement);

                //между 0 и последния
            }else if(index >=0 && index<=distanceList.size()-1){
                int removedElement = distanceList.get(index);
                sumOfRemoved+=removedElement;
                distanceList.remove(index);
                modifyList(distanceList,removedElement);

            }

        }
        System.out.println(sumOfRemoved);

    }
    public static void modifyList(List<Integer> list, int removedElement){
        for (int index = 0; index <= list.size()-1; index++) {
            int currentElement = list.get(index);
            if(currentElement<=removedElement){
                currentElement+=removedElement;
            }else {
                currentElement-=removedElement;
            }
            list.set(index,currentElement);
        }


    }
}
