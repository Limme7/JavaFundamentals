package MidExam;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(">>");

        int initialFamily = 50;
        int initialHeavy = 80;
        int initialSport = 100;
        double totalNationalTax = 0;

        for (int i = 0; i <array.length ; i++) {
            String[] input = array[i].split(" ");
            String carType = input[0];
            int years = Integer.parseInt(input[1]);
            int kilometers = Integer.parseInt(input[2]);

            if(!carType.equals("family") && !carType.equals("heavyDuty") && !carType.equals("sports")){
                System.out.println("Invalid car type.");
            }
            switch (carType){
                case "family":
                    double taxPerYear = 5;
                    double taxWithoutKilometers = initialFamily-(taxPerYear*years);
                    double taxtax = kilometers/3000;
                    double taxKilometers = taxtax*12;
                    double totalTax = taxWithoutKilometers+taxKilometers;
                    totalNationalTax=totalNationalTax+totalTax;

                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",carType,totalTax);

                    break;
                case "heavyDuty":
                    double taxPerYearHeavy = 8;
                    double taxWithoutKilometersHeavy =initialHeavy -(taxPerYearHeavy*years);
                    double taxtaxHeavy = kilometers/9000;
                    double taxKilometersHeavy = taxtaxHeavy*14;
                    double totalTaxHeavy = taxWithoutKilometersHeavy+taxKilometersHeavy;
                    totalNationalTax=totalNationalTax+totalTaxHeavy;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",carType,totalTaxHeavy);
                    break;

                case "sports":
                    double taxPerYearSport = 9;
                    double taxWithoutKilometerSport = initialSport -(taxPerYearSport*years);
                    double taxtaxSport = kilometers/2000;
                    double taxKilometersSport = taxtaxSport*18;
                    double totalTaxSport = taxWithoutKilometerSport+taxKilometersSport;
                    totalNationalTax=totalNationalTax+totalTaxSport;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",carType,totalTaxSport);
                    break;


            }

        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",totalNationalTax);

    }
}
