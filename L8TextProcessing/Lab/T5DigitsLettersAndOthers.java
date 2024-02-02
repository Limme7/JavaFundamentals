package L8TextProcessing.Lab;

import java.util.Scanner;

public class T5DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digitStr = new StringBuilder();
        StringBuilder letterStr = new StringBuilder();
        StringBuilder otherStr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char sybmol = text.charAt(i);
            if(Character.isDigit(sybmol)){
                digitStr.append(sybmol);

            }else if(Character.isLetter(sybmol)){
                letterStr.append(sybmol);

            }else{
                otherStr.append(sybmol);

            }

        }
        System.out.println(digitStr);
        System.out.println(letterStr);
        System.out.println(otherStr);
    }
}
