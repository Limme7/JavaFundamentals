package L3Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class T5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();

        int[] numbersArr = Arrays.stream(lineInput.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                sumEven += numbersArr[i];

            } else {
                sumOdd += numbersArr[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
