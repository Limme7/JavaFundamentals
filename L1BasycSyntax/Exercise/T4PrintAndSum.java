package L1BasycSyntax.Exercise;

import java.util.Scanner;

public class T4PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for(int number = start; number <= end; number++){
            System.out.print(number + " ");
            sum += number;



        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
