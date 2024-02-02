package L5Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T2GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sizeList = numList.size();

        for (int i = 0; i < sizeList/2; i++) {
            int firstNumber = numList.get(i);
            int secondNumber = numList.get(numList.size() -1);

            numList.set(i, firstNumber + secondNumber);
            numList.remove(numList.size() -1);

        }
        for (int element: numList){
            System.out.print(element+" ");
        }
    }
}
