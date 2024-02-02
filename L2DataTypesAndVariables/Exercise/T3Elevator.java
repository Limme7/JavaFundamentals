package L2DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class T3Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberPersons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) numberPersons / capacity);

        System.out.println(courses);
    }
}
