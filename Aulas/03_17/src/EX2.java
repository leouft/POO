import java.util.Scanner;

public class EX2 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int dia;

        dia = sc.nextInt();

        switch (dia)
        {
            case 1:
                System.out.println("\nDia da semana: domingo");
                break;
            case 2:
                System.out.println("\nDia da semana: segunda");
                break;
            case 3:
                System.out.println("\nDia da semana: terça");
                break;
            case 4:
                System.out.println("\nDia da semana: quarta");
                break;
            case 5:
                System.out.println("\nDia da semana: quinta");
                break;
            case 6:
                System.out.println("\nDia da semana: sexta");
                break;
            case 7:
                System.out.println("\nDia da semana: sábado");
                break;
            default:
                System.out.println("\nDia da semana: valor inválido");
                break;
        }
    }
}
