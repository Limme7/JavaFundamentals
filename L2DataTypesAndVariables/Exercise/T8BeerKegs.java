package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE; // най големия обем
        String maxModel = ""; // модела на най големия кег


        for (int keg = 1; keg <=n ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            //обем на кега = п * рна2ра * височината
            double volume = Math.PI* Math.pow(radius,2) * height;

            if (volume>maxVolume){
                maxVolume = volume;
                maxModel=model;
            }
        }
        System.out.println(maxModel);
    }
}
