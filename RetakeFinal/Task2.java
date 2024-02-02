package RetakeFinal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
            int inputLine = Integer.parseInt(scanner.nextLine());

            Pattern pattern = Pattern.compile("(?<symbols>[*@])(?<tag>[A-Z][a-z]{2,})\\1: " +
                    "\\[(?<First>[A-Za-z])\\]\\|\\[(?<Second>[A-Za-z])\\]\\|\\[(?<Third>[A-Za-z])\\]\\|$");



            for (int i = 1; i <= inputLine ; i++) {
                String input = scanner.nextLine();
                Matcher matcher = pattern.matcher(input);


                if (matcher.find()) {

                    String tag = matcher.group("tag");


                    char first = matcher.group("First").charAt(0);
                    char second = matcher.group("Second").charAt(0);
                    char third = matcher.group("Third").charAt(0);

                    System.out.printf("%s: %d %d %d%n", tag, (int) first, (int) second, (int) third);


                } else {
                    System.out.println("Valid message not found!");
                }
            }

        }
    }


