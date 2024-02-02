package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highestSnowballValue=Double.MIN_VALUE;
        double snow = 0;
        double time = 0;
        double quality = 0;


        for (int i = 0; i < n ; i++) {
            double snowballShow = Double.parseDouble(scanner.nextLine());
            double snowballTIme = Double.parseDouble(scanner.nextLine());
            double snowballQuality = Double.parseDouble(scanner.nextLine());

            double snowballValue = Math.pow((snowballShow/snowballTIme), snowballQuality);
            if(snowballValue>=highestSnowballValue){
                highestSnowballValue=snowballValue;
                quality=snowballQuality;
                snow=snowballShow;
                time = snowballTIme;



            }


        }

        System.out.printf("%.0f : %.0f = %.0f (%.0f)", snow, time, highestSnowballValue, quality);
    }
}
