import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Scanner for user input
    Scanner in = new Scanner(System.in);

    // Stating two variables for the user input
    int x,y;

    // Asking for units
    System.out.println("Input x: ");
    x = Integer.parseInt(in.nextLine());

    System.out.println("Input y: ");
    y = Integer.parseInt(in.nextLine());

    TouchMonitor monitor1 = new TouchMonitor("Samsung");
    monitor1.setTouchXY(x, y);
    monitor1.printData();

   // Monitor monitor2 = new Monitor("Miele");
   // monitor2.printData();

   // Monitor monitor3 = new Monitor("Samsung", true);
   // monitor3.printData();


    }
} // End of the main

// class Monitor
class Monitor {
    public boolean isOn;
    public String brand;

    // default constructor
    public Monitor(){
        isOn=false;
        brand="";
    }
    // 2nd constructor with a parameter
    public Monitor(String brandName){
        isOn=false;
        brand = brandName;
    }

    // 3rd constructor with two parameters (parameterized)
    public Monitor(String brandName, boolean isMonitorOn){
        brand = brandName;
        isOn = isMonitorOn;
    }

    public void start(){
        isOn = true;
    }

    public void shutdown(){
        isOn = false;
    }

    // PrintData for the monitor, condition to check a the same time if the monitor is on.
    public void printData(){
        System.out.println("Monitor");
        System.out.println("Brand: " + brand);

        if (isOn==true) {
            System.out.println("The monitor is on.");
        }
        else {
            System.out.println("The monitor is off.");
        }
    }
} // Monitor class ends

// Creating a new subclass (Inheritance) and adding few attributes
class TouchMonitor extends Monitor {

    // private attributes for touchMonitor
    private int touchX, touchY;

    // Default constructor
    public TouchMonitor(){
        isOn = false;
        brand = "";
        touchX = 0;
        touchY = 0;
    }

    // Parameterized constructor
    public TouchMonitor(String brand){
        isOn = false;
        this.brand = brand;
        touchX = 0;
        touchY = 0;
    }
    // Method for touchX and touchY
    public void setTouchXY(int x, int y) {
        touchX = x;
        touchY = y;
    }



    // OVERRIDE = New printData because inheritance PD doesn't print touchX and touchY
    public void printData(){
        // Another way to OVERRIDE previous method is to use super.-- command
        // super.printData(); -> to call from parent/superclass if public
        System.out.println("Monitor");
        System.out.println("Brand: " + brand);

        if (isOn==true) {
            System.out.println("The monitor is on.");
        }
        else {
            System.out.println("The monitor is off.");
        }
        System.out.println("TouchX: " + touchX + " TouchY: " + touchY);
    }
}







//        String subject;
//        int temp;
//        printFeverLimits();
//
//      do {
//          Scanner in = new Scanner(System.in);
//
//          System.out.println("Subject:");
//          subject = in.nextLine();
//          // System.out.println(subject);
//
//          System.out.println("Temperature:");
//          String temperature = in.nextLine();
//          // System.out.println(temperature);
//          temp = Integer.parseInt(temperature);
//
//
//          if(hasFever(subject,temp)==true){
//              System.out.println("The subject has fever");
//          }
//          else {
//              System.out.println("The subject has no fever");
//          }
//
//
//      }while((hasFever(subject,temp)==true));







//    static void printFeverLimits(){
//        System.out.println("Fever limits");
//        System.out.println("- human 37");
//        System.out.println("- dog 39");
//        System.out.println("- horse 38");
//
//
//
//    } // End of the method
//
//    static boolean hasFever(String subject, int temperature) {
//       if(subject.equals("human")&&temperature>=37){
//           return true;
//       }
//      else if(subject.equals("dog")&&temperature>=39){
//           return true;
//       }
//      else if(subject.equals("horse")&&temperature>=38){
//           return true;
//       }
//      else {
//          return false;
//       }
//
//
//    }


