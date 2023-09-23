package Day08Tasks;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a salary $");
        double salary = scanner.nextDouble();
        System.out.println("hourly rate: ");
        double weeklyHour = scanner.nextDouble();
        double hourRate = salary / (weeklyHour * 52);

        System.out.println("Hourly rate of the employee: " + hourRate);

        scanner.close();


    }
}
