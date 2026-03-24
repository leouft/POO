import java.util.Scanner;

public class EX1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int senha;
        do{
            System.out.print("Insira a senha: ");
            senha = sc.nextInt();
            if (senha != 2002)
                System.out.println("Senha Inválida.");
        } while (senha != 2002);
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
