public class Main {
    public static void main(String[] args) {
        // Trying out superclass
        Toy toy1 = new Toy("Lightsaber", 1);
        toy1.printData();

        System.out.println("----------");

        // Trying out subclass
        Lightsaber ls1 = new Lightsaber();
        ls1.printData();
    }
} // End of Main class

// New superclass

class Toy {

    // Attributes
    public String product;
    public int quantity;

    // Default constructor
    public Toy(){
        product = "";
        quantity = 0;
    }
    // Parameterized constructor
    public Toy(String product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    // prints all the values -method
    public void printData() {
        System.out.println("Your product details");
        System.out.println("Product: " + product);
        System.out.println("Weight: " + quantity);
    }
}

class Lightsaber extends Toy {
    // Adding new attributes
    public String crystal;
    public String hilt;
    public Boolean isOn;

    //Default constructor
    public Lightsaber() {
        product = "Lightsaber";
        quantity = 0;
        crystal = "";
        hilt = "";
        isOn = false;
    }
    // Adding one method for lightsaber
    public void turnOn(){
        if (isOn = true) {
            System.out.println("*Lightsaber turns on*");
        }
        else {
            System.out.println("*Lightsaber is off*");
            }
    }
        // Printing out all the data using super + adding new attributes.
        public void printData(){
            super.printData();
            System.out.println("Crystal: " + crystal);
            System.out.println("Hilt material: " + hilt);
            System.out.println("Is lightsaber on? " + isOn);
        }

 }

 class LaserPistol extends Toy {

 }
