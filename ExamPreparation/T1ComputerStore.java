package ExamPreparation;

import java.util.Scanner;

public class T1ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String type = scanner.nextLine();

        double priceWithoutTaxes = 0;


        while (!type.equals("regular") && !type.equals("special")) {


            double partPrice = Double.parseDouble(type);

            if (partPrice >= 0) {
                priceWithoutTaxes += partPrice;
            } else {
                System.out.println("Invalid price!");
            }
            type = scanner.nextLine();
        }

        double tax = priceWithoutTaxes * 0.2;
        double priceWithTax = priceWithoutTaxes + tax;

        if (priceWithTax == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            if (type.equals("special")) {
                System.out.printf("Total price: %.2f$", priceWithTax * 0.9);

            } else {
                System.out.printf("Total price: %.2f$", priceWithTax);


            }
        }
    }
}
