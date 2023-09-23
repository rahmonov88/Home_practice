package Day09_Tasks;

import java.util.Scanner;

public class GradeAfterRetake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put your score: ");
        int score = input.nextInt();
        System.out.print("Which attempt is this to retake the test?: ");
        int attempt = input.nextInt();

        if (attempt == 1) {
            score -= score * 0.10; // for example: x -= y; ---> x = x - y;
        }
        if (attempt == 2) {
            score -= score * 0.20;
        }
        if (attempt == 3) {
            score -= score * 0.35;
        }
        System.out.println("After the second retake attempt " + attempt + " , your score is: " + score);





    }

}
