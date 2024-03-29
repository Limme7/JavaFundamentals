package L5Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> separatedByPipeList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(separatedByPipeList);


        System.out.println(separatedByPipeList.toString().replace("[", "").replace("]","").trim().replaceAll(",","").replaceAll("\\s+", " "));
    }
}
