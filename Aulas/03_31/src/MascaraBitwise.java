public class MascaraBitwise {
    public static void main(String[] args) {

        int mask = 0b1000000;

        int[] x = new int[2];
        x[0] = 64;
        x[1] = 63;


        for (int i = 0; i < 2; i++)
        {
            System.out.println("\nVerificando o número: " + x[i]);
            if((x[i] & mask) != 0)
                System.out.println("\nO 7° bit é true");
            else
                System.out.println("\nO 7° bit é false");
        }
    }
}