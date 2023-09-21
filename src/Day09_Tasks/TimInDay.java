package Day09_Tasks;

import java.util.Scanner;

public class TimInDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it now (put between 0 and 24 only)?");
        int time = input.nextInt();

        if (time > 0 && time <= 12 ) {
            System.out.println("Good Morning");
        }
        if (time > 12 && time <= 15) {
            System.out.println("Good Afternoon");
        }
        if (time > 15 && time <= 24) {
            System.out.println("Good Evening");
        }
        if (time < 0 || time > 24) {
            System.out.println("Invalid Input");
        }
    }
}
