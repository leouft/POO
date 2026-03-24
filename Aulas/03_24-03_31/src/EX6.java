import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um inteiro: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++)
        {
            if (N % i == 0)
                System.out.println(i);
        }
    }
}
