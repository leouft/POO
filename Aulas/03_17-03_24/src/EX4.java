import java.util.Scanner;

public class EX4 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt(), fim = sc.nextInt();

        if (inicio < fim)
            System.out.printf("\nO JOGO DUROU: %d HORA(S)\n", fim-inicio);
        else
            System.out.printf("\nO JOGO DUROU: %d HORA(S)\n", (24-inicio)+fim);

        sc.close();
    }
}
