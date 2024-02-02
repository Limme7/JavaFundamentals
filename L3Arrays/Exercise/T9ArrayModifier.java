package L3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T9ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String [] commandParts = command.split(" ");
            String commandType = commandParts[0]; //"swap", "multiply", "decrease"

            switch(commandType){
                case "swap":
                    int index1 =Integer.parseInt(commandParts[1]);
                    int element1 = numbers[index1];
                    int index2 = Integer.parseInt(commandParts[2]);
                    int element2 = numbers[index2];

                    //swap
                    numbers[index1]=element2;
                    numbers[index2]=element1;


                    break;

                case  "multiply":
                    int multiplyElementIndex1 =Integer.parseInt(commandParts[1]);
                    int multiplyElement1 = numbers[multiplyElementIndex1];
                    int multiplyElementIndex2 = Integer.parseInt(commandParts[2]);
                    int multiplyElement2 = numbers[multiplyElementIndex2];
                    int product = multiplyElement1*multiplyElement2;

                    numbers[multiplyElementIndex1]=product;
                    break;

                case "decrease":
                    for (int index = 0; index <= numbers.length -1; index++) {
                        numbers[index]=numbers[index]-1;

                    }
                    break;
            }


            command= scanner.nextLine();
        }
        for (int index = 0; index <= numbers.length-1; index++) {
            if(index!=numbers.length-1){
                System.out.print(numbers[index]+ ", ");
            }else{
                System.out.print(numbers[index]);
            }
        }



    }
}
