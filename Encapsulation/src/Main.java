public class Main {
    public static void main(String[] args) {

        // testing elevator as public -> next step as private
        // Elevator elevator = new Elevator();
        // elevator.floor = 3;
        // System.out.println("Floor " + elevator.floor);

        // Using UpDown method to add floors
        Elevator elevator = new Elevator();
        elevator.goUpDown("up");
        elevator.goUpDown("up");
        // Used in public -  elevator.printData();

        elevator.setFloor(11);
        System.out.println(elevator.getFloor());

    }
}

class Elevator {

   // public int floor;

   // public Elevator(){
   //     floor = 0;
   // }
   private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;

        if(floor > 0 && floor <=10){
            this.floor = floor;
        }
        else {
            System.out.println("ERROR - The floor should be between 1-10");
        }
    }



    public Elevator(){
             floor = 0;
    }

    // printData method (First as public, next private)
    // public void printData(){
    //    System.out.println("ELEVATOR");
    //  System.out.println("Floor: " + floor);
    //  }

    // private
    private void printData(){
        System.out.println("ELEVATOR");
        System.out.println("Floor: " + floor);
    }

    // Creating up or down method
    public void goUpDown(String direction){
        // conditon for method to add or subtract floor level
        if (direction.equals("up")) {
            floor++;
        }
        else {
            floor--;
        }
        // Calling printData method
        printData();
    }

}