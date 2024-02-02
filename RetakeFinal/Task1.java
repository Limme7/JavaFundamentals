package RetakeFinal;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder string = new StringBuilder();

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                String substring = command.split(" ")[1];
                string.append(substring);

            } else if (command.contains("Upgrade")) {
                String occurrenceChar = command.split(" ")[1];
                char oldChar = occurrenceChar.charAt(0);
                int index1 = string.indexOf(occurrenceChar);
                int index2 = string.indexOf(occurrenceChar);

                int ascii = (int) oldChar + 1;
                char newchar = (char) ascii;
                string.deleteCharAt(index1);
                string.replace(index1,index2, String.valueOf(newchar));



            } else if (command.contains("Print")) {
                System.out.println(string.toString());

            } else if (command.contains("Index")) {

                String findChar = command.split(" ")[1];
                if (string.toString().contains(findChar)) {
                    int index1=string.indexOf(findChar);
                    int index = string.lastIndexOf(findChar);
                    System.out.printf("%d %d%n",index1,index);
                }else{
                    System.out.println("None");
                }

            } else if (command.contains("Remove")) {
                String substring = command.split(" ")[1];

                if (string.toString().contains(substring)) {
                    int startIndex = string.indexOf(String.valueOf(substring.charAt(0)));
                    int endIndex = startIndex + substring.length();
                    string.replace(startIndex, endIndex,"");
                }
            }
            command = scanner.nextLine();
        }
    }
}

