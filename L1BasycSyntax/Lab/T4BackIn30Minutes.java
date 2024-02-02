package L1BasycSyntax.Lab;

import java.util.Scanner;

public class T4BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());


        int allMins = (initHour*60) + initMin + 30;

        int hour = allMins / 60;
        int min = allMins % 60;

        if(hour > 23){
            hour = 0;

        }

        System.out.printf("%d:%02d", hour, min);

    }
}
