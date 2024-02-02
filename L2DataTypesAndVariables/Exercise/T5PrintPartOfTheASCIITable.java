package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T5PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code <= endNumber ; code++) {
            char symbol = (char) code;
            System.out.print(symbol + " ");

        }


    }
}
