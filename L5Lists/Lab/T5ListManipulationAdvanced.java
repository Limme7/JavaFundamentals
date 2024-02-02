package L5Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> newList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("end")){
            List <String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command){
                case "Contains":
                    int numContains = Integer.parseInt(commandLine.get(1));

                    if(newList.contains(numContains)){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No such number");
                    }

                    break;
                case "Print":
                    String command2 = commandLine.get(1);
                    if(command2.equals("even")){
                        List<Integer> evenNumbersList = getEvenNumbers(newList);
                        System.out.println(evenNumbersList.toString().replaceAll("[\\[\\],]", ""));
                    }else if (command2.equals("odd")){
                        List<Integer> oddNumbersList = getOddNumbers(newList);
                        System.out.println(oddNumbersList.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < newList.size(); i++) {
                        sum= sum + newList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "FIlter":
                    break;
            }

            input= scanner.nextLine();
        }

    }
    public static List<Integer> getEvenNumbers (List<Integer> initList){
        List<Integer> evenNumbersList=new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentItem = initList.get(i);
            if(currentItem%2==0){
                evenNumbersList.add(currentItem);
            }

        }
        return evenNumbersList;
    }
    public static List<Integer> getOddNumbers (List<Integer> initList){
        List<Integer> oddNumbersList = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentItemOdd = initList.get(1);
            if (currentItemOdd %2 !=0){
                oddNumbersList.add(currentItemOdd);
            }

        }
        return oddNumbersList;
    }
}
