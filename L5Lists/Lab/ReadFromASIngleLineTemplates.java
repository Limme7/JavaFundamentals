package L5Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadFromASIngleLineTemplates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        List<String> items = Arrays.stream(inputLine.split(" ")).collect(Collectors.toList());
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i <items.size() ; i++) {
            numbersList.add(Integer.parseInt(items.get(i)));


        }

       // List<String> items = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<Integer> newList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        System.out.println();
    }
}
