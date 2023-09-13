package Day_6_Practice_Programming;

public class Task1_Parking_lot {


        public static void main(String[] args) {
            /*create a main method
-Declare variable cars and
assign a value 10
-Print out "There are 10 cars
in the parking lot"
-Print out an empty line
-Then print out "2 more cars
drive in"
-Reassign cars to a value that
the amount increase by 2
(Hint you can either add
2 with arithmetic operator and reassign or
you can use the increment operator. Note:each increment increases it by one)
-Now, print out "There are 8
cars in the parking lot"
-Then 5 cars lefts. So
reassign the cars to the new value
-Then print out "There are xx
cars left in the parking lot
*/

            int cars = 10;
            System.out.println("2 cars drive into the parking lot");
            // approach 1:

            cars = cars + 2;
            System.out.println(cars);

            System.out.println("2 more cars drive in");

            // approach 2:
            cars++;
            cars++;
            System.out.println(cars);

            System.out.println("5 cars left");

            cars = cars - 5;
            System.out.println(cars);


    }
}