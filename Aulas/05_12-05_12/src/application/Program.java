package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String statusStr = sc.next().toUpperCase();
        OrderStatus status = OrderStatus.valueOf(statusStr);

        System.out.print("How many items to this order? ");
        int cont = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), status, client);

        for (int i = 0; i < cont; i++) {
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name: ");
            name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(name, price);

            OrderItem item = new OrderItem(quantity, price, product);

            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println("Order moment: " + sdf.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.clientData());
        System.out.println("Order items:");
        System.out.print(order.toString());
        System.out.printf("Total price: %.2f", order.total());

    }
}
