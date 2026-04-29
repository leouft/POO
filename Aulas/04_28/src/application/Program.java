package application;

import entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product produto = new Product(sc.nextLine(), sc.nextInt(), sc.nextDouble());

        System.out.printf("%s", produto);
    }
}
