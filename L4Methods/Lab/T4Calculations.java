package L4Methods.Lab;

import java.util.Scanner;

public class T4Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String functionInput = scanner.nextLine();
        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());
        switch (functionInput) {
            case "add":
                addNimbers(firstNumberInput,secondNumberInput);
                break;
            case "multiply":
                multiplyNimbers(firstNumberInput,secondNumberInput);
                break;
            case "subtract":
                substractNimbers(firstNumberInput, secondNumberInput);
                break;
            case "divide":
                divideNimbers(firstNumberInput, secondNumberInput);
                break;
        }

    }

    public static void addNimbers(int fistNum, int secondNum) {
        int result = fistNum + secondNum;
        System.out.println(result);
    }

    public static void multiplyNimbers(int fistNum, int secondNum) {
        int result = fistNum * secondNum;
        System.out.println(result);
    }
        public static void substractNimbers(int fistNum,int secondNum){
            int result = fistNum - secondNum;
            System.out.println(result);

    }
    public static void divideNimbers(int fistNum, int secondNum) {
        int result = fistNum / secondNum;
        System.out.println(result);
    }
}