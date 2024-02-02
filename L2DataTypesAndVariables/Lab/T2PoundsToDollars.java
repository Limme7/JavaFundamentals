package L2DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T2PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float input = Float.parseFloat(scanner.nextLine());
        float result = input*1.36f;
        System.out.printf("%.3f", result);
    }
}
