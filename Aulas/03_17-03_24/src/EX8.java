import java.util.Scanner;

public class EX8 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000)
            System.out.println("Isento");
        else
        {
            if (salario <= 3000)
                imposto = 0.08 * (salario - 2000);
            else if (salario <= 4500)
                imposto = 0.18 * (salario - 3000) + 80;
            else
                imposto = 0.28 * (salario - 4500) + 350;
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close();
    }
}
