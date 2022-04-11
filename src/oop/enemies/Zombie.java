package oop.enemies;

public class Zombie {

//    PROPERTIES
    private int maxHealth;
    private int attackDamage;
    private boolean isHungryForBrains;

//    CONSTRUCTORS

    public Zombie() {

    }

    public Zombie(int maxHealth, int attackDamage, boolean isHungryForBrains) {
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.isHungryForBrains= isHungryForBrains;
    }



//    GETTER AND SETTERS

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }



    public void attack() {
        System.out.println("Attacking and eating brains!");
    }
}
