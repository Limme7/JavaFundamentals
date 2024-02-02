package L8TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T2RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        //hi abc add

        List<String> repeatList = new ArrayList<>();
        for (String currentWord : inputArr) {
            int len = currentWord.length();

            String repeatWord = repeatString(currentWord, len);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));

    }
    public static String repeatString(String s, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(s);

        }
        return result.toString();
    }
}
