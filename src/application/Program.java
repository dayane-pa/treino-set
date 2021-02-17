package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static Scanner scanner = new Scanner(System.in);
    public static Set<Integer> listSet = new HashSet<>();

    public static void main(String[] args) {
        String[] courses = {"A", "B", "C"};
        for(int index = 0; index < courses.length; index++){
            System.out.print("How many students for course " + courses[index] + "? ");
            int amountOfStudent = scanner.nextInt();
            students(amountOfStudent);
        }

      System.out.println("Total students: " + listSet.size());
    }

    public static void students(int amountOfStudent) {

        for (int index = 0; index < amountOfStudent; index++) {
            int studentsCode = scanner.nextInt();
            listSet.add(studentsCode);
        }
        return;
    }
}
