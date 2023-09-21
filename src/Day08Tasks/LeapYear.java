package Day08Tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean Leap = (year % 4 == 0);

        System.out.println("The " + year + " is a Leap year: " + Leap);

        scanner.close();




    }
}
