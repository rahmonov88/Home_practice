package Day09_Tasks;

import java.util.Scanner;

public class OceanTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current oxygen level of in your tank?");
        int level = input.nextInt();
        if (level >= 90) {
            System.out.println("Your tank is full");
        }
        if (level < 90 && level >= 80) {
            System.out.println("Still okay");
        }
        if (level < 80 && level >= 70) {
            System.out.println("Don't go too far");
        }
        if (level < 70 && level >= 60) {
            System.out.println("Start to head back");
        }
        if (level < 60 && level >=50) {
            System.out.println("Be careful now you are at 50%");

        }
        }
}
