package L1BasycSyntax.Exercise;

import java.util.Scanner;

public class T10PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForLight = Double.parseDouble(scanner.nextLine());
        double priceForRobes = Double.parseDouble(scanner.nextLine());
        double priceForBelts = Double.parseDouble(scanner.nextLine());


        double sumLight = Math.ceil(countOfStudents+0.10*countOfStudents)* priceForLight;
        double sumRobes = countOfStudents * priceForRobes;
        double sumBelts = (countOfStudents - (countOfStudents / 6)) * priceForBelts;

        double totalSum = sumBelts+sumRobes+sumLight;

        if(totalSum<= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else if (totalSum>=budget){
            System.out.printf("George Lucas will need %.2flv more.", totalSum-budget);
        }




    }
}
