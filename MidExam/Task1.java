package MidExam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());

        double profitFromEachCity = 0;
        double totalProfitFromTrip = 0;

        for (int i = 1; i <= numberOfCities; i++) {
            String cityName = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            if(i%3==0){
                ownerExpenses=ownerExpenses+ownerExpenses*0.50;
            }else if (i%5==0){
                ownerIncome=ownerIncome*0.90;
            }else if(i==15){
                ownerExpenses=ownerExpenses+ownerExpenses*0.50;


            }
            profitFromEachCity=ownerIncome-ownerExpenses;
            totalProfitFromTrip= totalProfitFromTrip + profitFromEachCity;


            System.out.printf("In %s Burger Bus earned %.2f leva.%n",cityName, profitFromEachCity);


        }


        System.out.printf("Burger Bus total profit: %.2f leva.%n",totalProfitFromTrip);
    }
}