import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        // Adding one object with parameters
        Car car = new Car("Toyota", "RAV4", 40);

        // printing car data first
        car.printData();

        // using while-loop for UI interaction.
        while(true){

            System.out.println("a=accelerate b=break x=exit");
            String userInput = myObj.nextLine();

            if(userInput.equals("a")){
               car.accelerate();
            }
            else if(userInput.equals("b")){
                car.brake();
            }
            if(userInput.equals("x")){
                break;
            }
        }

    }
} // End of Main class

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
        // if(amountOfFuel>0) {
            System.out.println("Car is accelerating");
           // amountOfFuel--;
        }
       // else if(amountOfFuel==0) {
         //   System.out.println("No fuel left on the tank!");
       // }
   // }
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