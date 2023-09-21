package Day08Tasks;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        byte age = scanner.nextByte();
        System.out.println("Enter you favorite number: ");
        long number = scanner.nextLong();

        boolean isAgeBetween18And25 = (18 <= age && age <= 25);
        //                              true    AND     false ---> output: false

        System.out.println("You are student: " + isAgeBetween18And25);

        scanner.close();
    }


}
