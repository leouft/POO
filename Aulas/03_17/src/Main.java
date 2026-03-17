import java.util.Scanner;
import java.util.Locale;

public class Main {
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        char plano;
        int tempo;
        float valor = 0;
        System.out.print("Insira a opção do plano:\nPlano Básico [B]\nPlano Plus [P]\nOpção: ");
        plano = sc.next().charAt(0);
        if (plano != 'B' && plano != 'P')
        {
            System.out.print("\nOpção inexistente, certifique-se de utilizar B ou P maiúsculo, insira a opção: ");
            plano = sc.next().charAt(0);
        }
        System.out.print("\nInsira o tempo em minutos gastos: ");
        tempo = sc.nextInt();
        switch (plano)
        {
            case 'B':
                valor = 50;
                if (tempo > 100)
                {
                    valor += ((tempo-100)*2);
                }
                break;
            case 'P':
                valor = 100;
                if (tempo > 300)
                {
                    valor += ((tempo-300));
                }
                break;
            default:
                System.out.println("\nPlano escolhido não existente (verifique se escreveu em maiúsculo).");
                break;
        }
        System.out.printf("\nValor a pagar: %.2f\n", valor);
        sc.close();
    }
}