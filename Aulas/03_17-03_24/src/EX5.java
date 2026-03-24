import java.util.Scanner;

public class EX5 {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt(), cont = sc.nextInt();
        switch (item)
        {
            case 1:
                System.out.printf("\nTotal: R$ %.2f\n", (float)cont*4);
                break;
            case 2:
                System.out.printf("\nTotal: R$ %.2f\n", (float)cont*4.5);
                break;
            case 3:
                System.out.printf("\nTotal: R$ %.2f\n", (float)cont*5);
                break;
            case 4:
                System.out.printf("\nTotal: R$ %.2f\n", (float)cont*2);
                break;
            case 5:
                System.out.printf("\nTotal: R$ %.2f\n", (float)cont*1.5);
                break;
        }
        sc.close();
    }
}
