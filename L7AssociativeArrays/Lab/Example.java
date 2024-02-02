package L7AssociativeArrays.Lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,  Integer> map = new HashMap<>();
        map.put("Yordan", 1112);
        map.put("Sofi", 3998);
        map.put("Viki", 359);


        map.remove("Yordan");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
