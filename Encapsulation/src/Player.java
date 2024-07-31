public class Player {

    // This class will be made by using the public access modifiers only to show how important the
    // concept of ENCAPSULATION is;

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Game over!");
            //Reduce the number of lives remaining for the player;
        }
    }

    public int healthRemaining () {
        return this.health;
    }
}
