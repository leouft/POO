import java.util.Scanner;

public class EX2 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
        sc.close();
    }
}
