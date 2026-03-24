import java.util.Scanner;

public class EX7 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat(), y = sc.nextFloat();

        if (x == 0 && y == 0)
            System.out.println("Origem");
        else if (x > 0 && y > 0)
            System.out.println("Q1");
        else if (x < 0 && y > 0)
            System.out.println("Q2");
        else if (x < 0 && y < 0)
            System.out.println("Q3");
        else
            System.out.println("Q4");
        sc.close();
    }
}
