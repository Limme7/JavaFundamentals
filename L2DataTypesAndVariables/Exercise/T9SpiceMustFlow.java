package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yard = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmount = 0;

        while(yard >= 100){
            int gain = yard-26;
            totalAmount+=gain;
            days++;
            yard-=10;

        }
        System.out.println(days);
        if(totalAmount>=26){
            totalAmount-=26;

        }
        System.out.println(totalAmount);
    }
}
