package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("End")){

            if (command.contains("Add")){
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numberList.add(numberToAdd);
            }else if (command.contains("Insert")){
                int elemntToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if(isIndexValid(index, numberList.size())){
                    numberList.add(index, elemntToInsert);
                }else{
                    System.out.println("Invalid index");
                }
            }else if(command.contains("Remove")){
                int index = Integer.parseInt(command.split(" ")[1]);
                if(isIndexValid(index, numberList.size())){
                    numberList.remove(index);
                }else{
                    System.out.println("Invalid index");
                }
            }else if(command.contains("Shift left")){
                int countToShiftLeft = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= countToShiftLeft; i++) {
                    int firstNumber = numberList.get(0);
                    numberList.add(firstNumber);
                    numberList.remove(0);
                }

            }else if(command.contains("Shift right")){
                int countToShiftRight = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= countToShiftRight ; i++) {
                    int lastNumber = numberList.get(numberList.size()-1);
                    numberList.add(0, lastNumber);
                    numberList.remove(numberList.size()-1);
                }
            }

            command=scanner.nextLine();

        }
        for (int num : numberList){
            System.out.print(num + " ");
        }
    }
    public static boolean isIndexValid(int index, int sizeOfList){
        return index >=0 && index<= sizeOfList -1;

    }
}
