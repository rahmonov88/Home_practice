package Day_6_Practice_Programming;

public class Task3_Shopping {
    public static void main(String[] args) {
        /*add main method
declare two variables and assign 0
and 0.0 as values  :
number of items
price
Write a print statement to print
out "I have numberOfItem in the cart"
Write a print statement to print
out "We pick up 1 water"
Write a print statement to print
out "How many items in the cart:
numberOfItem"
(Use increment, so the number
of items increases right away, then it is
printed)
Reassign the price value by taking
the price value, which was 0 and add 2.5, and
then reassign to the price variable
Write a print statement to print
out "We pick up 2 eggs"
Write a 2 print statements to print
out "How many items in the cart:
numberOfItem"
(Use increment on each print
statement, so the number of items increases right away, then it is printed)
  */

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("I have "+ numberOfItems +" in the cart");
        System.out.println("We pick up 1 water");
        System.out.println("How many items in the cart: " + ++numberOfItems);
        price = 2.5;

        ++numberOfItems;

        System.out.println("We pick up 2 eggs");
        ;
        System.out.println("How many items in the cart: " + ++numberOfItems);
        System.out.println("Total price=$"+ price);

    }
}
