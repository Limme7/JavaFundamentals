package L6ObjectsClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T5Students {
    static class Student{

        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student (String firstName, String  lastName, String age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;

        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();


        while (!input.equals("end")){
            String [] inputStudentArr = input.split(" ");
            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String homeTown = inputStudentArr[3];

            Student currentStudent = new Student(firstName, lastName, age, homeTown);
            studentList.add(currentStudent);

            input= scanner.nextLine();

        }
        String searchTown = scanner.nextLine();

        for (Student item:studentList){
            if (item.getHomeTown().equals(searchTown)){
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }

    }
}
