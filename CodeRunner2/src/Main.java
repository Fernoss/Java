import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Width?");
        int ans1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Length?");
        int ans2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Area is " + Utils.calcArea(ans1, ans2));

    }
}
class LightSwitch{
    public boolean lightsOn;

    public void printInfo(){

        if (lightsOn==true) {
            System.out.println("Lights are on");
        }
        else {
            System.out.println("Lights are off");
        }
    }
}
class Dimmer extends LightSwitch{

    // attribute, later on the brightness can only be 0-100
    int brightness;

    // Override printInfo


    @Override
    public void printInfo() {
        if(brightness > 0) {
            System.out.println("Brightness is " + brightness + ".");
        }
        else{
            System.out.println("Lights are off.");
        }
    }

    // creating a method set brightness
    public void setBrightness(int brightnesslevel){
        brightness = brightnesslevel;
        if(brightnesslevel > 0 && brightnesslevel <= 100){
            lightsOn = true;
        }
        else if (brightnesslevel==0){
            lightsOn = false;
        }

    }

}

class Utils {
    // Attributes
    public static int width;
    public static int height;

    // static method printTitle
    public static void printTitle(){
        System.out.println("*******");
        System.out.println("* OOP *");
        System.out.println("*******");
    }

    // static areaCalc, calculate the area
    public static int calcArea(int widthInput, int heightInput){
        width = widthInput;
        height = heightInput;
        int area = widthInput * heightInput;
        return area;
    }
}