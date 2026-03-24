import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um inteiro: ");
        int N = sc.nextInt();

        if (N > 0) {
            for (int i = N; i > 1; i--) {
                N *= i - 1;
            }
        }
        else if (N == 0)
            N = 1;

        System.out.println(N);
    }
}
