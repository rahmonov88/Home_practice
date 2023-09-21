package Day09_Tasks;

import java.util.Scanner;

public class IsStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 5;
        int y = 20;
        if (y == 20) {
        }else{
            x=5;
        }

        System.out.println("If y=" + y + " then x=" + x);

        boolean max = true;
        int fees = 0;
        if (max=true) {
            fees=50;
        }

        System.out.println("If fees=" + fees + " then max=" + max);

        int a = 20;
        int b = 50;
        int c = 70;
        if (b == 50 && c >= 70) {
            a = 20;
        }
        System.out.println("if variable b=" + b + " and c is greater and equal to " + c + " then a=" + a);

        System.out.print("Enter a temp: ");
        int ideaTemp = input.nextByte();
        if (ideaTemp >= 70 && ideaTemp <= 80) {

            System.out.println("Idea temp is: " + ideaTemp);
        }
    }
}
