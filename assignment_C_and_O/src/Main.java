public class Main {
    public static void main(String[] args) {

    // Printing first the default
    Enemy enemy1 = new Enemy();
    enemy1.printData();

    System.out.println("****************************");

    // Printing with different values for the parameter
    Enemy enemy2 = new Enemy(20,"Vampire", true);
    enemy2.printData();

    System.out.println("****************************");

    Enemy enemy3 = new Enemy(30, "Skeleton", true);
    enemy3.printData();

    System.out.println("****************************");

    Enemy enemy4 = new Enemy(50, "Moloch", true);
    enemy4.printData();


    }
} // End of the main

// Class Enemy created here

class Enemy {

    // attributes
    public int health;
    public String enemyRace;
    public boolean isSpawned;

    // default constructor
    public Enemy(){
        health = 10;
        enemyRace = "human";
        isSpawned = false;
    }
    // Parameterized constructor
    public Enemy(int healthPoints, String enemyRace1, boolean isSpawned){
        health = healthPoints;
        enemyRace = enemyRace1;
        this.isSpawned = isSpawned;
    }

    // Print data method
    public void printData(){
        System.out.println("Enemy spawned: " + enemyRace);
        System.out.println("Health: " + health);

        // Making different conditions/dialogues for different enemy characters
        if (isSpawned&&enemyRace.equals("human")){
            System.out.println(enemyRace + " says: Hello there!");
        }
        else if (isSpawned&&enemyRace.equals("Vampire")){
            System.out.println(enemyRace + " says: Buahaha!");
        }
        else if (isSpawned&&enemyRace.equals("Skeleton")){
            System.out.println(enemyRace + " *old creaky bones noise*");
        }
        else if (isSpawned&&enemyRace.equals("Moloch")){
            System.out.println(enemyRace + " says: Alea iacta est.");
        }
        else {
            System.out.println("*cricket noise*");
        }
    }
}












