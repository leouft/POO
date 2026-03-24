import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um inteiro: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++)
        {
            System.out.print("\nInsira o númerador e denominador: ");
            int n = sc.nextInt(), d = sc.nextInt();

            if (d == 0)
                System.out.println("Divisão impossível");
            else
                System.out.printf("%.1f\n", (float)n/d);
        }
        sc.close();
    }
}
