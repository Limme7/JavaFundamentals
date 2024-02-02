package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> telephoneList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("End")){
            String[] modificationList = input.split(" - ");
            String command = modificationList[0];
            String phone = modificationList[1];

            switch (command){
                case "Add":
                    if(!telephoneList.contains(phone)){
                        telephoneList.add(phone);
                    }
                    break;

                case "Remove":
                    if(telephoneList.contains(phone)){
                        telephoneList.remove(phone);
                    }
                    break;

                case "Bonus phone":
                    String newPhone = phone.split(":")[1];
                    String oldPhone = phone.split(":")[0];
                    if(telephoneList.contains(oldPhone)){
                        telephoneList.add(telephoneList.indexOf(oldPhone)+1, newPhone);

                    }


                    break;
                case"Last":
                    if(telephoneList.contains(phone)){
                        telephoneList.add(telephoneList.size(),phone);
                        telephoneList.remove(phone);
                    }
                    break;
            }


            input=scanner.nextLine();


        }
        System.out.println(telephoneList.toString().replace("[", "").replace("]","").trim().replaceAll(",","").replaceAll("\\s+", ", "));




    }
}
