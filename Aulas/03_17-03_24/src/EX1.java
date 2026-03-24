import java.util.Scanner;

public class EX1 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0)
            System.out.println("NEGATIVO");
        else
            System.out.println("NÃO NEGATIVO");
        sc.close();
    }
}
