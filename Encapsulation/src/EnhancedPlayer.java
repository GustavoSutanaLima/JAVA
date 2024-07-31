public class EnhancedPlayer {
    //class's field
    private String playersName;
    private int healthBar = 100; //defining a default value for a class field;
    private String playersWeapon;

    // **** TIP ****
    // If you need to change the name of a field for example and can't (because the code is too long) or you don't wanna change them
    // one by one you can use an intelliJ's feature called REFACTOR: all you need to do is:
    // > Select the field name you wanna change;
    // > Click it with the mouse's right button
    // > Hover over REFACTOR and then RENAME;
    // > Then you just type the new name for it and hit Enter twice;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.playersName = name;
        this.playersWeapon = weapon;
        if (health > 0 && health <=100) {
            this.healthBar = health;
            //this validation doesn't allow me to assign the value of a EnhancedPlayer object field (this.health)
            //if the value passed on the constructor of this class it less than zero or greater than 100;
            //otherwise the value of this.health will be the default value assigned on the field definition;
        }
    }

    public void looseHealth(int damage) {
        this.healthBar -= damage;
        if(this.healthBar <= 0) {
            System.out.println("Game over!");
            this.healthBar = 0;
        }
    }

    public int getHealthBar() {
        return this.healthBar;
    }
}
