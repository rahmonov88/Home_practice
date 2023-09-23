package Day08Tasks;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the product name: ");
        String productName = scanner.next();
        System.out.println("enter the price: $");
        double price = scanner.nextDouble();
        System.out.println("enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("enter their full name: ");
        String fullName = scanner.next();
        double totalCost = price * quantity;
        System.out.println(fullName + " you ordered for " + quantity + " " + productName +
                " has been placed. Your total is " + totalCost + ".");

        scanner.close();





    }

}
