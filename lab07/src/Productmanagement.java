

import java.util.Scanner;

import Product.ProductManager;

public class Productmanagement {
    public static void addProduct(ProductManager manager, Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter product discount (0-100): ");
        double discount = scanner.nextDouble();
        manager.addProduct(name, price, discount);
    }

    public static void removeProduct(ProductManager manager, Scanner scanner) {
        System.out.print("Enter product name to remove: ");
        String removeName = scanner.nextLine();
        manager.removeProduct(removeName);
    }

    public static void updateProduct(ProductManager manager, Scanner scanner) {
        System.out.print("Enter product name to update: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter new product name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new product price: ");
        double newPrice = scanner.nextDouble();
        System.out.print("Enter new product discount (0-100): ");
        double newDiscount = scanner.nextDouble();
        manager.updateProduct(oldName, newName, newPrice, newDiscount);
    }
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Product Management System!");
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct(manager, scanner);
                    break;
                case 2:
                    removeProduct(manager, scanner);
                    break;
                case 3:
                    updateProduct(manager, scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
        
            }
        }
    }

}
