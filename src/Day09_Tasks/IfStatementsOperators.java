package Day09_Tasks;

import java.util.Scanner;

public class IfStatementsOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a boolean value (true or false): ");
        boolean inputValue = input.nextBoolean();

        boolean oppositeValue = !inputValue;

        System.out.print("The opposite of you what you put is: " + oppositeValue);


    }
}
