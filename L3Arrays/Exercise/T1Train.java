package L3Arrays.Exercise;

import java.util.Scanner;

public class T1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numberPeople = new int[n];
        int sum = 0;


        for (int i = 0; i < numberPeople.length; i++) {
            numberPeople[i]=Integer.parseInt(scanner.nextLine());


            System.out.print(numberPeople[i]+" ");
            sum+=numberPeople[i];



            
        }

        System.out.printf("%n%d", sum);
        

    }
}
