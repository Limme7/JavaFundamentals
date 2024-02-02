package L3Arrays.Exercise;

import java.util.Scanner;

public class T10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] initialLoot  =scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){
            String[] commandPart = command.split(" ");

            switch (commandPart[0]){
                case "Loot":
                    for (int i = 1; i < commandPart.length ; i++) {
                        boolean alreadyInLoot = false;
                        for (int j = 0; j < initialLoot.length; j++) {
                            if(commandPart[i].equals(initialLoot[j])){
                                alreadyInLoot=true;
                                break;
                            }
                        }
                        if(!alreadyInLoot){
                            String newLoot = commandPart[i]+ " " + String.join(" ", initialLoot);
                            initialLoot=newLoot.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandPart[1]);
                    if(position<=initialLoot.length && position>=0){
                        String dropItem = initialLoot[position];
                        for (int i = position; i <initialLoot.length-1 ; i++) {
                            initialLoot[i]=initialLoot[i+1];
                        }
                        initialLoot[initialLoot.length-1]=dropItem;

                    }else{
                        break;
                    }
                    break;
                case "Steal":

                    break;
            }
        }
    }
}
