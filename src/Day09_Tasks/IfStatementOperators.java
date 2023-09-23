package Day09_Tasks;

import java.util.Scanner;

public class IfStatementOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your salary: $");
        double salary = input.nextDouble();
        System.out.println("You are a full time employee? ");
        boolean yesOrNo = input.nextBoolean();

        if (yesOrNo == true) {
            salary = salary + 20000;
        }else{
            if (yesOrNo == false) {
                salary = salary - 5000;
            }
        }
        System.out.println("This is you final salary: " + salary);

    }

}
