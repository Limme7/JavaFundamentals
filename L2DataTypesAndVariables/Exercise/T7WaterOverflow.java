package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int fullCapacity = 255;
        int totalCapacity = 0;


        for (int i = 0; i <n ; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if(totalCapacity+quantity<=fullCapacity){
                totalCapacity+=quantity;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalCapacity);
        }
    }

