import java.util.Scanner;

public class EX3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] combustivel = {0, 0, 0};
        int op;
        do{
            System.out.print("Combustível abastecido:\n[1] Álcool\n[2] Gasolina\n[3] Diesel\n[4] Sair\nOpção: ");
            op = sc.nextInt();
            while (op > 4 || op < 1){
                System.out.print("Código inválido, insira novamente [1-4]: ");
                op = sc.nextInt();
            }
            if (op != 4)
                combustivel[op-1]++;
        } while (op != 4);
        System.out.printf("\nMUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", combustivel[0], combustivel[1], combustivel[2]);
        sc.close();
    }
}
