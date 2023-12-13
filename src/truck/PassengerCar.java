package truck;

public class PassengerCar extends Vehicle{

    public PassengerCar(String model, String manufacturer, int year, String colour,
                 int maxWeight, int maxFuel, String driver)
    {
        super(model, manufacturer, year, colour, maxWeight, maxFuel, driver);

    }
    public String toString() {
        return "Model: "+getModel()+", "+getManufacturer()+", "+getYear()+", "+getColour()+
                "\nMaxPassengers: "+getMaxWeight()+", MaxFluel: "+getMaxFuel()+
                "\nDriver: "+getDriver();
    }
    public void load (int loadWeight)
    {
        if (loadWeight>getRemainingCapacity())
        { System.out.println("There's no available passenger places in the car.");
            printRemainingCargo();
            return;}
        if (loadWeight==0)
        {System.out.println("You must get in any Passengers first.");}
        else
        {   currentWeight += loadWeight;
            System.out.println("Passengers are getting In: " + loadWeight);
            printRemainingCapacity();}
    }
    public void unload (int unloadWeight)
    {
        if (unloadWeight>currentWeight)
        {System.out.println("There are less Passengers, then you trying to get out.");}
        else
        {System.out.println("Passengers are getting Out: " + unloadWeight);
            currentWeight = currentWeight - unloadWeight;
            printRemainingCargo();}
    }
    private void printRemainingCapacity()
    {
        if (currentWeight < maxWeight)
            System.out.println("Passenger places remained = " + (maxWeight-currentWeight));
        else
            System.out.println("You have reached the maximum number of Passengers.");
    }
    private int getRemainingCapacity ()
    { return maxWeight - currentWeight;}
    private void printRemainingCargo ()
    { System.out.println("Passengers in the car = " + currentWeight);}
}

