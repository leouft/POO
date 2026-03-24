import java.util.Scanner;

public class EX2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y;

        do{
            x = sc.nextInt();
            y = sc.nextInt();

            if (x != 0 && y != 0) {
                if (x > 0 && y > 0)
                    System.out.println("Primeiro");
                else if (x < 0 && y > 0)
                    System.out.println("Segundo");
                else if (x < 0 && y < 0)
                    System.out.println("Terceiro");
                else
                    System.out.println("Quarto");
            }
        } while (x != 0 && y != 0);
    }
}
