package FinalExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String commands = scanner.nextLine();

        while(!commands.equals("Complete")){
        String[] commandArr = commands.split(" ");
         String command = commandArr[0];

          if (command.equals("Insert")) {
              int index = Integer.parseInt(commandArr[1]);
              String chare = commandArr[2];


              commands = scanner.nextLine();
           }
        }
    }
}