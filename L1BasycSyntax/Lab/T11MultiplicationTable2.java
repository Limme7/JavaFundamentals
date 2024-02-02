package L1BasycSyntax.Lab;

import java.util.Scanner;

public class T11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        for (int i = secondNumber; i <=10 ; i++) {
            int product = firstNumber*i;
            System.out.printf("%d X %d = %d%n", firstNumber,i,product);


            }
        if(secondNumber>10){
            int product2 = firstNumber*secondNumber;
            System.out.printf("%d X %d = %d%n", firstNumber,secondNumber,product2);
        }
    }
}
