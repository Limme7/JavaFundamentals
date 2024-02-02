package L5Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> nameList = new ArrayList<>();

        for (int i = 1; i <=countCommands ; i++) {
            String command = scanner.nextLine();
            List<String > partsList = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            String name = partsList.get(0);

            if(partsList.size()==3){//going
                if(nameList.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    nameList.add(name);

                }
            }else if (partsList.size()==4){ // not going
                if (nameList.contains(name)) {
                    nameList.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n", name);
                }


            }

        }
        for(String name : nameList) {
            System.out.println(name);
        }
        }

    }

