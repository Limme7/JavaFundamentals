package L5Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {

            double firstElement = numbersList.get(i);
            double secondElement = numbersList.get(i + 1);

            if(firstElement == secondElement){
                numbersList.set(i, numbersList.get(i)+numbersList.get(i+1));
                numbersList.remove(i + 1);

                i= - 1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbersList," "));
    }
    public static String joinElementsByDelimiter(List<Double> list,String delimiter){
        String result = "";
        for (Double num : list){
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(num) + delimiter;

            result += numFormat;
        }

        return result;
    }
}
