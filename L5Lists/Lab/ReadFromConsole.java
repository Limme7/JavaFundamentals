package L5Lists.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            numbersList.add(currentNum);


        }
        for (Integer number : numbersList) {


            System.out.println(number);
        }
    }
}
