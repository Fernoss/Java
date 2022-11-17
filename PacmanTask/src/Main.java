public class Main {
    public static void main(String[] args) {

    // Creating Pac-man object
    Pacman pacman = new Pacman();

    // Creating fruit objects
    Fruit fruit1 = new Fruit();
    Fruit fruit2 = new Fruit();
    Fruit fruit3 = new Fruit();

    // We send an object of Fruit to the eat method
    pacman.eat(fruit2);

    System.out.println(fruit1.isVisible);
    System.out.println(fruit2.isVisible);
    System.out.println(fruit3.isVisible);

    // Creating Ghost object to try out Pac-man class method decreaseLives()
    Ghost yellow = new Ghost();
    yellow.eatPacman(pacman);


    }
} // End of main class

class Pacman{
    // Attributes, should be made private, for the sake of this project as instructed we have made public
    // If private, we would use get method.
    public int points;
    public int lives;

    // Default
    public Pacman(){
        points = 0;
        lives = 2;
    }

    // Method print data
    public void printData(){
        System.out.println("Points: " + points);
    }

    // Method we call when Pac-man ate -> "LISTENER-method" would be used in real-life.
    // Our solution as of now, simple method
    // As a parameter we use CLASS
    public void eat(Fruit eatenFruit){
        System.out.println("Pac-man ate a fruit");
        eatenFruit.disappear();
    }

    //Creating a new method, Pacman lives are decreased when eaten
    public void decreaseLives(){
        System.out.println("Pac-man eaten");
        System.out.println("Pac-man lost one health-point");
        lives--;
    }
}

class Fruit {
    // Attribute
    public boolean isVisible;

    // Default
    public Fruit(){
        isVisible = true;
    }

    // Method disappear, when Pac-man eats, fruit disappears
    public void disappear(){

        isVisible = false;
        System.out.println("Fruit is hidden");
    }

}
class Ghost {
    // Has only one method as of now, no attributes needed at this point
    public void eatPacman(Pacman pacObject){
        pacObject.decreaseLives();

    }
}