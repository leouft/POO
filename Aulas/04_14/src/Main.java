import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        Product p = new Product();

        System.out.print("Name: ");
        p.name = sc.nextLine();
        System.out.print("Price: ");
        p.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        p.quantity = sc.nextInt();

        System.out.printf("\nProduct data: %s, $%.2f, %d units, Total: $ %.2f\n", p.name, p.price, p.quantity, p.TotalValueInStock());

        System.out.print("\nEnter the number of products to be added in stock: ");
        p.AddProducts(sc.nextInt());

        System.out.printf("\nUpdated data: %s, $%.2f, %d units, Total: $ %.2f\n", p.name, p.price, p.quantity, p.TotalValueInStock());

        System.out.print("\nEnter the number of products to be removed from stock: ");
        p.RemoveProducts(sc.nextInt());

        System.out.printf("\nUpdated data: %s, $%.2f, %d units, Total: $ %.2f\n", p.name, p.price, p.quantity, p.TotalValueInStock());

        sc.close();
    }
}
