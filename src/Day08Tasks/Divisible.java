package Day08Tasks;


import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean divisibleBy2 = (number % 2 == 0);
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);

        scanner.close();
    }
}


