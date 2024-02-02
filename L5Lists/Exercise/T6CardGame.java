package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T6CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstHandList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHandList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while(firstHandList.size()!=0 && secondHandList.size()!=0){



        int firstPlayerCard = firstHandList.get(0);
        int secondPlayerCard = secondHandList.get(0);
            firstHandList.remove(0);
            secondHandList.remove(0);

        if(firstPlayerCard>secondPlayerCard){
            firstHandList.add(firstPlayerCard);
            firstHandList.add(secondPlayerCard);



        }else if (firstPlayerCard<secondPlayerCard){
            secondHandList.add(secondPlayerCard);
            secondHandList.add(firstPlayerCard);


        }

        }
        if(firstHandList.size()==0){
            int sumSecondHand = secondHandList.stream().mapToInt(Integer::valueOf).sum();
            System.out.printf("Second player wins! Sum: %d",sumSecondHand);

        }else {
            int sumFirstHand = firstHandList.stream().mapToInt(Integer::valueOf).sum();
            System.out.printf( "First player wins! Sum: %d",sumFirstHand);
        }

    }

}
