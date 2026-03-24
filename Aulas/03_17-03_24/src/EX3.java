import java.util.Scanner;

public class EX3 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();

        if (A > B)
        {
            if(A % B == 0)
                System.out.println("São Múltiplos");
            else
                System.out.println("Não são Múltiplos");
        }
        else if (B % A == 0)
            System.out.println("São Múltiplos");
        else
            System.out.println("Não são Múltiplos");
        sc.close();
    }
}
