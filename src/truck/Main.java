package truck;

public class Main {
    public static void main(String[] args) {

        Vehicle tr1 = new Truck("Atego 1224", "Mercedes-Benz",
                2008,"white",175, 120, "Smith" );
        Vehicle tr2 = new Truck ("Bug 1134", "Volvo", 2015,
                "red", 160,120, "Bond");

        Vehicle pCar1 = new PassengerCar("Logan", "Reno", 2020, "red",
                4, 100,"Black");
        Vehicle pCar2 = new PassengerCar("Leon", "Seat", 2014, "red",
                4, 100, "White");

        Vehicle [] passengerCars = {pCar1, pCar2};
        for (Vehicle passengerCar : passengerCars)
        {   System.out.println(passengerCar);
            System.out.println();}

        pCar1.load(2);
        pCar1.load(2);
        pCar1.load(1);
        pCar1.setCurrentFuel(100);
        pCar1.move();
        pCar1.stop();
        pCar1.unload(4);
        System.out.println();

        Vehicle [] trucks = {tr1, tr2};
        for (Vehicle truck : trucks)
        { System.out.println(truck);
            System.out.println();}

        tr1.load (50);
        tr1.load(125);
        tr1.load(10);
        tr1.setCurrentFuel(10);
        tr1.setCurrentFuel(120);
        tr1.move();
        tr1.unload(190);
        tr1.unload(90);
        System.out.println();

        for (Vehicle tr : trucks)
        {System.out.println("truck "+tr.getManufacturer()+", "+ tr.getModel()+
                ": Driver: " + tr.getDriver());}
        System.out.println();

        for (Vehicle pCar : passengerCars)
        {System.out.println("Passenger Car " +pCar.getManufacturer()+ ", "+ pCar.getModel()+
                ": Driver: "+ pCar.getDriver());}
    }
}
