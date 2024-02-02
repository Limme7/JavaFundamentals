package L7AssociativeArrays.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Example2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<String,  Integer> map = new LinkedHashMap<>();
            map.put("Yordan", 1112);
            map.put("Sofi", 3998);
            map.put("Viki", 359);


            map.remove("Yordan");

            if(map.containsKey("Sofi")){
                System.out.println("Yes");
            }
        }
    }
