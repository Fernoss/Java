import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Testing both methods
       /* Calculation.calcArea(2,5);
        System.out.println(Calculation.recArea);

        Calculation.calcArea(10);
        System.out.println(Calculation.radArea);
        */
        Scanner myObj = new Scanner(System.in);
        System.out.println("Calculate the area of a rectangle or a circle (r/c)");
        String userInput = myObj.nextLine();

        if(userInput.equalsIgnoreCase("r")){
            System.out.println("Type Width:");
            String wdth = myObj.nextLine();
            System.out.println(("Type Length:"));
            String lngth = myObj.nextLine();
            // Changing String into int
            int iwdth = Integer.parseInt(wdth);
            int ilngth = Integer.parseInt(lngth);

            Calculation.calcArea(iwdth,ilngth);
            System.out.println(iwdth + " * " + ilngth);
            System.out.println("Result = " + Calculation.recArea + "m2");


        }
        else if(userInput.equalsIgnoreCase("c")){
            System.out.println("Type the radius:");
            String rad1 = myObj.nextLine();
            // Changing String to double
            double drad = Double.parseDouble(rad1);

            Calculation.calcArea(drad);
            System.out.println(Math.PI + " * " + drad);
            System.out.println("Result = " + Calculation.radArea + "m2");
        }


    }
}
class Calculation {
    // Attributes
    public static int width;
    public static int length;
    public static int recArea;
    public static double radius;
    public static double radArea;

    // Default


    // Creating a static method that calculates the area of a rectangle.
    // Two parameters: width and length, returns result.
    public static void calcArea(int wdth, int lngth){
    width = wdth;
    length = lngth;
    recArea = wdth * lngth;
    return;
    }
    // Creating a static method that calculates the area of a circle
    // Two parameters: width and length return result.
    public static void calcArea(double rds){
    radius = rds;
    radArea = Math.PI * (2 * rds);
    return;
    }
}