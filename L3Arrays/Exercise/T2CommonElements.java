package L3Arrays.Exercise;

import java.util.Scanner;

public class T2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String firstRow = scanner.nextLine();
      String secondRow = scanner.nextLine();

      String[] firstArray = firstRow.split(" ");
              String[] secondArray = secondRow.split(" ");

              // Обхождаме всеки елемент във втория масив
              for(String secondElement : secondArray){
                  //какво повтаряме за всеки елемент от втория масив: обхождаме първия масив
                  for( String firstElement : firstArray){
                      if (firstElement.equals(secondElement)){
                          System.out.print(firstElement+ " ");
                      }
                  }
              }
    }
}
