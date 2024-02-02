package L4Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberInput = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());
        double power = mathPower(numberInput, powerInput);


        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(power));

    }
    public static double mathPower (double number, int power){
        double result = 1;
        result= Math.pow(number, power);
        return result;

    }
}
