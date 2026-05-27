package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.printf("Product #%d data:\n", i+1);
            System.out.print("Common, user or imported (c/u/i)? ");
            char op = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            Product product;

            switch (op) {
                case 'u':
                case 'U':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    String dateStr = sc.nextLine();
                    String[] dateSplit = dateStr.split("/");
                    Date date = new Date(Integer.parseInt(dateSplit[2]) - 1900, Integer.parseInt(dateSplit[1]) - 1, Integer.parseInt(dateSplit[0]));

                    product = new UsedProduct(name, price, date);
                    break;
                case 'I':
                case 'i':
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();

                    product = new ImportedProduct(name, price, customsFee);
                    break;
                default:
                    product = new Product(name, price);
                    break;
            }
            products.add(product);
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            if (product instanceof UsedProduct temp) {
                System.out.printf("%s ", temp.priceTag());
            }
            else if (product instanceof ImportedProduct temp) {
                System.out.printf("%s ", temp.priceTag());
            }
            else {
                System.out.printf("%s ", product.priceTag());
            }
        }

    }
}
