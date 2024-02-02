package L1BasycSyntax.Exercise;

import java.util.Scanner;

public class T9Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOFOrders=Integer.parseInt(scanner.nextLine());
        double priceForCoffe =0;
        double totalPrice = 0;


        for(int i = 0; i<countOFOrders;i++) {


            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            priceForCoffe=((daysInMonth*capsulesCount)*pricePerCapsule);
            totalPrice+= priceForCoffe;
            System.out.printf("The price for the coffee is: $%.2f%n", priceForCoffe);

        }
        System.out.printf("Total: $%.2f%n", totalPrice);




    }
}
