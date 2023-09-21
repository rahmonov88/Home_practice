package Day08Tasks;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter product price and quantity: ");
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        double revenue = price * quantity;

        System.out.println("Revenue: $" + revenue);

        scanner.close();


    }
}
