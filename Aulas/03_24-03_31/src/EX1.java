import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro de 1 à 1000: ");
        int X = sc.nextInt();

        if (X >= 1 && X <= 1000) {
            for (int i = 1; i <= X; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }

        }
        sc.close();
    }
}
