package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        r.Width = sc.nextDouble();
        r.Height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", r.Area());
        System.out.printf("PERIMETER = %.2f\n", r.Perimeter());
        System.out.printf("DIAGONAL = %.2f\n", r.Diagonal());
        sc.close();
    }
}
