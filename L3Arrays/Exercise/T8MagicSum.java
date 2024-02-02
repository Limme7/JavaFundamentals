package L3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index <=array.length-1 ; index++) {
            int number = array[index];
            for (int i = index+1; i <=array.length-1 ; i++) {
                int number2 = array[i];

                if(number+number2 == givenNumber){
                    System.out.printf("%d %d%n", number,number2);
                }

            }

        }


    }
}
