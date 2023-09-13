package Day_6_Practice_Programming;

public class Task5_GiftCard {
    public static void main(String[] args) {

 /*add main method
                -Declare variables for gift card
        balance, item1 price, item2 price and give
        them values 200, 40, 100 respectively
                -Decalare a variable for remaining
        gift card balance and calculate it based on
        the information above
                -Print out the following:
        "The gift card started with a
        balance of $xxx and after buying item1 for
        $xxx and item2 for $xxx,
                the remaining balance of the
        gift card is $xxx"
        Note: use the variables for the
        appropriate places.
  */
        int giftCardBalance = 200;
        int item1 = 40;
        int item2 = 100;
        int remaningBalance = giftCardBalance - item1 - item2;

        System.out.println("Remaining balance of the gift card is $"+remaningBalance);

    }
}
