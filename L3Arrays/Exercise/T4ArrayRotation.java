package L3Arrays.Exercise;

import java.util.Scanner;

public class T4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <=countRotation ; rotation++) {
            //ротация на масив
            //1. вземаме първия елемент
            String firstElement = array[0];
            //2. местя всички елементи наляво
            for (int index = 0; index < array.length -1; index++) {
                array[index]=array[index+1];
            }
            //3. задавам последния елемнт в масива да е първия
            array[array.length-1]=firstElement;

        }

        for(String number : array){
            System.out.print(number + " ");
        }

    }
}
