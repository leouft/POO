import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número de casos de teste: ");
        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            float[] tmp = new float[3];
            float md;
            System.out.print("\nInsira os três valores: ");
            tmp[0] = sc.nextFloat();
            tmp[1] = sc.nextFloat();
            tmp[2] = sc.nextFloat();

            md = ((tmp[0]*2)+(tmp[1]*3)+(tmp[2]*5))/10;
            System.out.printf("%.1f\n",md);
        }
        sc.close();
    }
}
