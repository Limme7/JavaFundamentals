package L1BasycSyntax.Exercise;

import java.util.Scanner;

public class T3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;

        if (typeGroup .equals ("Students")){
            if(day.equals ("Friday")){
                price = 8.45;
            }else if (day.equals ("Saturday")){
                price = 9.80;

            }else if (day.equals ("Sunday")){
                price = 10.46;
            }
        }else if (typeGroup.equals ("Business")){
            if(day.equals ("Friday")){
                price = 10.90;
            }else if (day.equals ("Saturday")){
                price = 15.60;

            }else if (day.equals ("Sunday")){
                price = 16;
            }

        }else if(typeGroup.equals("Regular")){
            if(day.equals ("Friday")){
                price = 15;
            }else if (day.equals ("Saturday")){
                price = 20;

            }else if (day .equals ("Sunday")){
                price = 22.50;
            }
        }
        double totalPrice = persons * price;
        double dicount = 0;
        if (typeGroup.equals("Regular") && persons>=10 && persons<=20){
            dicount = totalPrice*0.05;

        }else if(typeGroup.equals("Business") && persons>=100){
            dicount = 10*price;

        }else if(typeGroup.equals("Students") && persons>=30){
            dicount = totalPrice*0.15;
        }
        System.out.printf("Total price: %.2f", totalPrice-dicount);

    }
}
