package L8TextProcessing.Lab;

import java.util.Scanner;

public class T4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWordsArr) {
            if (text.contains(bannedWord)) {
                text=text.replace(bannedWord, repeatString("*", bannedWord.length()));
            }
        }

        System.out.println(text);
    }

    public static String repeatString(String s, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(s);
        }
        return result.toString();
    }
}

