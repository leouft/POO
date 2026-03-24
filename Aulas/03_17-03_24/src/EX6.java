import java.util.Scanner;

public class EX6 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        if (0 <= num && num <= 25)
            System.out.println("\nIntervalo [0,25]");
        else if (25 < num && num <= 50)
            System.out.println("\nIntervalo (25,50]");
        else if (50 < num && num <= 75)
            System.out.println("\nIntervalo (50,75]");
        else if (75 < num && num <= 100)
            System.out.println("\nIntervalo (75,100]");
        else
            System.out.println("\nFora de intervalo");
        sc.close();
    }
}
