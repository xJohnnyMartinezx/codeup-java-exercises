package oop.game;

import oop.enemies.Zombie;

public class GameRunner {

    public static void main(String[] args) {

//        CREATING AN INSTANCE OF OF ZOMBIE CLASS AND SAVING IT IN A VARIABLE
        Zombie zombie = new Zombie(75,25, true);
        Zombie otherZombie = new Zombie(100, 50, false);
        Zombie emptyZombie = new Zombie();
        zombie.attack();

        System.out.println(otherZombie.getMaxHealth());
        otherZombie.setMaxHealth(50);
//        System.out.println(otherZombie.setMaxHealth());

    }
}
