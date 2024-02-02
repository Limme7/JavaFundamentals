package FinalExam;


import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> userSentMessages = new HashMap<>();
        HashMap<String, Integer> userReceivedMessages = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            String[] token = input.split("=");

            switch (token[0]) {
                case "Add":
                    String username = token[1];
                    int sent = Integer.parseInt(token[2]);
                    int received = Integer.parseInt(token[3]);

                    if (!userSentMessages.containsKey(username)) {
                        userSentMessages.put(username, sent);
                        userReceivedMessages.put(username, received);
                    }
                    break;

                case "Empty":
                    String usernameEmpty = token[1];

                    if ("All".equals(usernameEmpty)) {
                        userSentMessages.clear();
                        userReceivedMessages.clear();
                    } else {
                        userSentMessages.remove(usernameEmpty);
                        userReceivedMessages.remove(usernameEmpty);
                    }
                    break;

                case "Message":
                    String sender = token[1];
                    String receiver = token[2];

                    if (userSentMessages.containsKey(sender) && userReceivedMessages.containsKey(receiver)) {
                        userSentMessages.put(sender, userSentMessages.get(sender) + 1);
                        userReceivedMessages.put(receiver, userReceivedMessages.get(receiver) + 1);

                        if (userSentMessages.get(sender) + userReceivedMessages.get(sender) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", sender));
                            userSentMessages.remove(sender);
                            userReceivedMessages.remove(sender);
                        }

                        if (userSentMessages.get(receiver) + userReceivedMessages.get(receiver) >= capacity) {
                            System.out.println(String.format("%s reached the capacity!", receiver));
                            userSentMessages.remove(receiver);
                            userReceivedMessages.remove(receiver);
                        }
                    }
                    break;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", (userSentMessages.size() + userReceivedMessages.size()) / 2);

        userSentMessages.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparing(Map.Entry::getKey))
                .forEach(e -> {
                    int sentAndReceived = userSentMessages.get(e.getKey())
                            + userReceivedMessages.get(e.getKey());
                    System.out.printf("%s - %d%n", e.getKey(), sentAndReceived);
                });
    }
}