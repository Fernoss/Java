public class Main {
    public static void main(String[] args) {

    // Creating first object with arguments
    Car car1 = new Car("Fiat", "500", 50);
    car1.printData();
    System.out.println("-----------------------");
        car1.brake();
        System.out.println("*Skreek!*");
        car1.accelerate();
        System.out.println("*Vroom! Vroom!*");
        System.out.println("*Lost one fuel unit*");
        car1.printData();

    // Creating second object to test the fuel condition
    System.out.println("-----------------------");
    Car car2 = new Car("Porsche", "911", 1);
    car2.printData();
        System.out.println("-----------------------");
        car2.brake();
        System.out.println("*Skreek!*");
        car2.accelerate();
        System.out.println("*Vroom! Vroom!*");
        System.out.println("*Lost one fuel unit*");
        car2.printData();
        car2.accelerate();

        System.out.println("-----------------------");
    // Testing refuel method
        Car car3 = new Car("BMW", "320", 30);
        car3.printData();
        car3.fuel(10);
        System.out.println("-----------------------");

    // Testing car constructor
    Car car4 = new Car();
    car4.printData();
    }
} // End of Main class

// Creating a class: Car
class Car {
    // default constructor
    public Car(){
        brand = "";
        model = "";
        amountOfFuel = 0;

    }

    // Setting attributes
    public String brand, model;
    public int amountOfFuel;

    // Methods: brake, accelerate, printData
    public void brake(){
        System.out.println("Car is breaking");
    }
    public void accelerate(){
        // Making condition for the car to accelerate if fuel in the tank.
        if(amountOfFuel>0) {
            System.out.println("Car is accelerating");
            amountOfFuel--;
        }
        else if(amountOfFuel==0) {
            System.out.println("No fuel left on the tank!");
        }
    }
    // Attribute parameters
    public Car(String brand, String model, int amountOfFuel){
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
    }


    public void printData(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }
    // Creating a refuel method, to add more fuel to the tank
    public void fuel(int refuel){
        int newFuel = amountOfFuel + refuel;
        System.out.println("Fuel on the tank: " + amountOfFuel);
        System.out.println("Refuel: " + refuel);
        System.out.println("Fuel on the tank after the refuel: " + newFuel);
    }


}

