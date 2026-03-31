import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] vetorS = s.split(" ");
        for (int i = 0; i < vetorS.length; i++) {
            System.out.println("\n" + vetorS[i]);
        }
    }
}