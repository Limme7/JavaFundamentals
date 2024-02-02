package L3Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int index = 0; index <= number.length -1; index++) {
            int currentElement = number[index];
            //проверка дали сумата на елементите в ляво == сумата на елементите в дясно
            int leftSum = 0;//сумата на елементите в ляво
            int rightSum = 0;// сумата на елементите в дясно

            //лявата сума -> всички елементи от индекс 0 до моя( не вкл)
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum+=number[leftIndex];
            }
            // дясната сума - всички елементи след моя индекс + 1 до последния Дължината минус 1

            for (int rightIndex = index +1; rightIndex <= number.length-1; rightIndex++) {
                rightSum+=number[rightIndex];
            }
            //проверка дали сумите са равни
            if(leftSum==rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }

        }
        if(!isFound) {
            System.out.println("no");
        }
    }
}
