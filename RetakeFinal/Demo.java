package RetakeFinal;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Map<String, List<String>> bandMembers = new LinkedHashMap<>();
                Map<String, Integer> bandTime = new LinkedHashMap<>();
                String input = scanner.nextLine();
                while (!input.equals("Start!")) {
                    String[] tokens = input.split(";\\s+");
                    String command = tokens[0];
                    String bandName = tokens[1];
                    if (command.equals("Add")) {
                        if (!bandMembers.containsKey(bandName)) {
                            bandMembers.put(bandName, new ArrayList<>());

                        }
                        List<String> membersFromBand= bandMembers.get(bandName);
                        String[] members = tokens[2].trim().split(", ");
                        for (String member : members) {
                            if (!membersFromBand.contains(member)) {
                                membersFromBand.add(member);
                            }
                        }
                    } else if (command.equals("Play")){
                        bandTime.putIfAbsent(bandName, 0);
                        int time = Integer.parseInt(tokens[2]);
                        bandTime.put(bandName, bandTime.get(bandName) + time);
                    }
                    input = scanner.nextLine();
                }

                int totalTime = 0;
                for (Integer value : bandTime.values()) {
                    totalTime += value;
                }
                System.out.println("Total time: " + totalTime);
        bandTime.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .forEach(System.out::println);



                Map.Entry<String, List<String>> entry = bandMembers.entrySet().iterator().next();

                System.out.println(entry.getKey());

                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.printf("=> %s%n", entry.getValue().get(i));

                }

            }
    }



