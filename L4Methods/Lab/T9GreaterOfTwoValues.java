package L4Methods.Lab;

import java.util.Scanner;

public class T9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeInput = scanner.nextLine();

        switch (typeInput) {
            case "int":
                int firstNumInput = Integer.parseInt(scanner.nextLine());
                int secondNumInput = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumInput,secondNumInput));

                break;

            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));

                break;

            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString,secondString));
                break;
        }


    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }

    }

    public static char getMax(char fistChar, char secondChar) {
        if (fistChar > secondChar) {
            return fistChar;
        } else {
            return secondChar;

        }
    }

    public static String getMax(String fistString, String secondString) {
        String result = "";
        if (fistString.compareTo(secondString) > 0) {
            result = fistString;
        } else {
            result = secondString;

        }
        return result;
    }
}
