package L8TextProcessing.Lab;

import java.util.Scanner;

public class T3SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        //ice
        //kicegiciceeb

        while(text.contains(toRemove)){
            text = text.replace(toRemove, "");

        }
        System.out.println(text);

    }
}
