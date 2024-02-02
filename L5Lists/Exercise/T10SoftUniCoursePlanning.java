package L5Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> scheduleList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("course start")){
            String[] modificationList = input.split(":");
            String command = modificationList[0];
            String lessonTitle = modificationList[1];

            switch (command){
                case "Add":
                    if(!scheduleList.contains(lessonTitle)){
                        scheduleList.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(modificationList[2]);
                    if(!scheduleList.contains(lessonTitle)){
                        scheduleList.add(index, lessonTitle);
                    }
                        break;
                case "Remove":
                    if(scheduleList.contains(lessonTitle)){
                        scheduleList.remove(lessonTitle);
                    }
                    int indexLesson = scheduleList.indexOf(lessonTitle);
                    if(scheduleList.get(indexLesson + 1).equals(lessonTitle+"-Exercise")) {
                        scheduleList.remove(indexLesson + 1);
                    }

                        break;
                case "Swap":
                    String lessonTitle2 = input.split(":")[2];
                    if (scheduleList.contains(lessonTitle) && scheduleList.contains(lessonTitle2)) {
                        int lesson1Index = scheduleList.indexOf(lessonTitle);
                        int lesson2Index = scheduleList.indexOf(lessonTitle2);
                        scheduleList.set(lesson1Index, lessonTitle2);
                        scheduleList.set(lesson2Index, lessonTitle);

                        String exOne = lessonTitle + "-Exercise";
                        String exTwo = lessonTitle2 + "-Exercise";
                        if (scheduleList.contains(exOne)) {
                            scheduleList.remove(scheduleList.indexOf(exOne));
                            scheduleList.add(scheduleList.indexOf(lessonTitle + 1), exOne);
                        }
                        if (scheduleList.contains(exTwo)) {
                            scheduleList.remove(scheduleList.indexOf(exTwo));
                            scheduleList.add(scheduleList.indexOf(lessonTitle2) + 1, exTwo);
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = scheduleList.indexOf(lessonTitle);
                    if(scheduleList.contains(lessonTitle)){
                        if(indexLessonTitle==scheduleList.size()-1){
                            scheduleList.add(indexLessonTitle+1,exercise);
                        }
                    }else if (!scheduleList.get(indexLessonTitle+1).equals(exercise)) {
                        scheduleList.add(indexLessonTitle +1,exercise);
                    }else{
                        scheduleList.add(lessonTitle);
                        scheduleList.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(scheduleList);
    }
    private static void printList(List<String> elements){
        int count = 1;
        for(String element:elements){
            System.out.println(count + "." + element);
            count++;
        }
    }
}
