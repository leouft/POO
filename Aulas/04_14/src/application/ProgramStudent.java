package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        s.name = sc.nextLine();
        for (int i = 0; i < 3; i++)
            s.points[i] = sc.nextDouble();

        System.out.printf("\nFINAL GRADE = %.2f\n", s.finalGrade());
        if(s.result()) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", s.missingPoints());
        }
        sc.close();
    }
}
