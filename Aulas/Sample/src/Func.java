import java.util.Scanner;

public class Func {
    public static float calmed(int x, int y){
        return (((float)x+(float)y)/2);
    }

    public static Scanner sc = new Scanner(System.in);

    public static void printV(int[] V){
        for (int i = 0; i < V.length; i++) {
            System.out.println(V[i]);
        }
    }
}
