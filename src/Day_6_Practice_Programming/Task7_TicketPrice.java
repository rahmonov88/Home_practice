package Day_6_Practice_Programming;

public class Task7_TicketPrice {
    public static void main(String[] args) {

        /* add main method declare two variables and assign
city1 = "Chicago"
city2 = "Virginia"
base ticket price = 110.50
miles between cities = 739.8
ticket price = add to the base
ticket price by dividing miles by 10
Example output:
The ticket price from
city1 to city2 is $ticketPrice"
         */
        String city1 = "Chicago";
        String city2 = "Virginia";

        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        double ticketPrice = baseTicketPrice + milesBetweenCities/10;
        System.out.println();
        System.out.println("The ticket price from " +city1+" to "+city2+ " is $" + ticketPrice);

    }
}
