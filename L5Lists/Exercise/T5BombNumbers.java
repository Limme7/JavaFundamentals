package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> data = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String bombNumber = data.get(0);
        int power = Integer.parseInt(data.get(1));

        int sum = 0;

        while(elements.contains(bombNumber)){
            int elementIndex = elements.indexOf(bombNumber);

            int left= Math.max(0, elementIndex-power);
            int right =Math.min(elementIndex+power, elements.size()-1);

            for (int i = right; i >=left ; i--) {
                elements.remove(i);

            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}
