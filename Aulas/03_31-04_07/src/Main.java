import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o objeto sc, que servirá para receber as entradas.

        Rectangle r = new Rectangle(); // Cria o objeto "r".
        r.setWidth(sc.nextDouble()); r.setHeight(sc.nextDouble()); // Atribui a largura e altura com valores
        System.out.println("ÁREA = " + r.area()); // Imprime na saída o valor da área.
        System.out.println("PERÍMETRO = " + r.perimeter()); // Imprime na saída o valor do perímetro.
        System.out.println("DIAGONAL = " + r.diagonal()); // Imprime na saída o valor da diagonal.
        sc.close();
    }
}
