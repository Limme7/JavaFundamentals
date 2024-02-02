package L9RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<Day>\\d{2})([-.\\/]{1})(?<month>[A-Z][a-z]{2})(:?\\2)(?<Year>\\d{4})");
        Matcher matcher= pattern.matcher(input);

        while(matcher.find()){
            String day  = matcher.group("Day");
            String month = matcher.group("month");
            String year = matcher.group("Year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day,month,year);


        }




    }

}
