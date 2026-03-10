import java.util.Scanner;

public class EX1 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        double b, B, h, area;

        System.out.print("Insira a base menor do trapézio: ");
        b = sc.nextDouble();
        System.out.print("Insira a base maior do trapézio: ");
        B = sc.nextDouble();
        System.out.print("Insira a altura do trapézio: ");
        h = sc.nextDouble();

        area = (b + B) / 2 * h;

        System.out.println("A área do trapézio é: " + area);
    }
}
