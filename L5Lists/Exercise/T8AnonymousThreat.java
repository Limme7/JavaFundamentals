package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("3:1")){
            if(command.contains("merge")){

                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex =   Integer.parseInt(command.split(" ")[2]);

                if(startIndex<0){
                    startIndex = 0;
                }
                if (endIndex>names.size()-1){
                    endIndex=names.size()-1;

                }
                boolean isValidIndexes = startIndex<=names.size()-1 &&endIndex>=0&&startIndex<endIndex;
                if(isValidIndexes){
                    String resultMerge = "";
                    for (int i = startIndex; i <= endIndex ; i++) {
                        String currentText = names.get(i);
                        resultMerge+=currentText;
                    }
                    for (int index = startIndex; index <=endIndex ; index++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, resultMerge);
                }


            }else if(command.contains("divide")){
                int index = Integer.parseInt(command.split(" ")[1]);
                        int parts = Integer.parseInt(command.split(" ")[2]);

                        String elementForDivide = names.get(index);
                        names.remove(index);
                        int partSize = elementForDivide.length()/parts;
                        int beginIndexOfText = 0;
                for (int part = 1; part <parts ; part++) {
                    names.add(index, elementForDivide.substring(beginIndexOfText,beginIndexOfText + partSize));
                    index++;
                    beginIndexOfText +=partSize;
                }
                names.add(index,elementForDivide.substring(beginIndexOfText));

            }
            command=scanner.nextLine();

        }

        for(String text : names){
            System.out.print(text + " ");
        }

    }
}
