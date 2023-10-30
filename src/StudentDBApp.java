import java.util.Scanner;

public class StudentDBApp {
    public static void main(String[] args) {
        //asking number of students
        System.out.println("Enter number of students to enroll:");
        Scanner std = new Scanner(System.in);
        int numberOfStudents = std.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int n=0;n<numberOfStudents;n++){
            students[n]  = new Student();
        }



    }
}

