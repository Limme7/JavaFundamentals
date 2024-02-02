package L5Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> newList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        newList.removeIf(e -> e <0);

        if (newList.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(newList);
            System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
