package Day09_Tasks;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int first = input.nextInt();
        System.out.print("Second number: ");
        int second = input.nextInt();
        System.out.print("Third number: ");
        int third = input.nextInt();

        if (first > second && first > third) { // && = true x true ----> output: true, if false is not printed
            int greatest = first;
            System.out.println("The greatest number from " + first + ", " + second + ", " + third + " is: "
                    + greatest);
        }
        if (second > first && second > third) {
            int greatest = second;
            System.out.println("The greatest number from " + first + ", " + second + ", " + third + " is: "
                    + greatest);
        }
        if (third > second && third > first) {
            int greatest = third;
            System.out.println("The greatest number from " + first + ", " + second + ", " + third + " is: "
                    + greatest);
        }

    }
}
