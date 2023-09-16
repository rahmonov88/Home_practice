package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Cheese";
        int numOfSlices = 10;
        int numOfPeople = 4;

        int slicesPerPerson = numOfSlices / numOfPeople;
        int slicesLeftOver = numOfSlices % numOfPeople;

        String report = "We order" + typeOfPizza + "pizza with the" + numOfSlices + "slices. " + numOfPeople + "perple ate " + slicesPerPerson + "for each. There were " + slicesLeftOver + "slices Lefr";

        System.out.println(report);

    }
}
