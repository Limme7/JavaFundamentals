package L3Arrays.Lab;


import java.util.Scanner;

public class T4ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineInput = scanner.nextLine().split(" ");

        for (int i = 0; i < lineInput.length / 2; i++) {
            String oldElement = lineInput[i];
            lineInput[i] = lineInput[lineInput.length - 1 - i];
            lineInput[lineInput.length - 1 - i] = oldElement;

        }
        System.out.println(String.join(" ", lineInput));


    }
}
