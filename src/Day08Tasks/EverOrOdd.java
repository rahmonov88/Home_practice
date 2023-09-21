package Day08Tasks;


import java.util.Scanner;

public class EverOrOdd {
        public static void main(String[] args) {

                   // Scanner scanner = new Scanner(System.in);
             Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an int number: ");
            int number = scanner.nextInt();

            boolean isEven = (number % 2 == 0);
            boolean isOdd = (!isEven);

            System.out.println(number + " is even: " + isEven);
            System.out.println(number + " is odd: " + isOdd);

            scanner.close();





        }
}
