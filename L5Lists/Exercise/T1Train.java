package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            if(command.contains("Add")){
                int passengers = Integer.parseInt(command.split(" ")[1]);
                wagonList.add(passengers);
            }else{
                int passengersToAdd = Integer.parseInt(command);
                for (int index = 0; index < wagonList.size(); index++) {
                    int currentWagon = wagonList.get(index);
                    if(currentWagon + passengersToAdd <= maxCapacity){
                        wagonList.set(index,currentWagon+passengersToAdd);
                        break;
                    }

                }
            }



            command=scanner.nextLine();
           }
        for(int wagon : wagonList){
            System.out.print(wagon + " ");
        }
        }


    }

