package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T1IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int forthNumber = Integer.parseInt(scanner.nextLine());

        int result = ((firstNumber+secondNumber) / thirdNumber ) * forthNumber;
        System.out.println(result);
    }
}
