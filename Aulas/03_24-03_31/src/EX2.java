import java.util.Scanner;

public class EX2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int N = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < N; i++)
        {
            System.out.print("\nInsira um número inteiro: ");
            int X = sc.nextInt();
            if (X >= 10 && X <= 20)
                in++;
            else
                out++;
        }
        System.out.printf("\n%d in\n%d out\n", in, out);
        sc.close();
    }
}
