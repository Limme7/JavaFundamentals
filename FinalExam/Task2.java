package FinalExam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int inputs = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < inputs; i++) {

                String input = scanner.nextLine();

                Pattern pattern = Pattern.compile("(\\|(?<Boss>[A-Z]{4,})\\|\\:\\#(?<Title>[A-Za-z]+\\s[A-Za-z]+)\\#)");
                Matcher matcher = pattern.matcher(input);

                if (matcher.find()) {
                    String bossName = matcher.group("Boss");
                    String bossTitle = matcher.group("Title");
                    System.out.printf("%s, The %s%n", bossName, bossTitle);
                    System.out.printf(">> Strength: %s%n", bossName.length());
                    System.out.printf(">> Armor: %s%n", bossTitle.length());

                } else
                    System.out.println("Access denied!");
            }
        }
    }

