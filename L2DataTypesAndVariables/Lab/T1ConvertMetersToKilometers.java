package L2DataTypesAndVariables.Lab;

import java.util.Scanner;

public class T1ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());

        double inMeters = kilometers/1000.0;

        System.out.printf("%.2f",inMeters);
    }
}
