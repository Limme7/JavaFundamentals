package L8TextProcessing.Lab;

import java.util.Scanner;

public class T1ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("end")){
            StringBuilder reversed = new StringBuilder();
            for (int i = word.length()-1; i >=0 ; i--) {
                char symbol = word.charAt(i);
                reversed.append(symbol);
            }
            System.out.printf("%s = %s%n",word, reversed.toString());
            word= scanner.nextLine();

        }
    }
}
