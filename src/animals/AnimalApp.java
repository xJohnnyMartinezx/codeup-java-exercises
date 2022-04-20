package animals;

public class AnimalApp {

    public static void main(String[] args) {


//        Animal animal = new Animal();

        int numLegs = 4;
        int fishNumLegs = 0;
        String preferredClimate = "In the house.";
        String catPreferredClimate = "In the house on the couch.";
        String fishPreferredClimate = "In the water";

        Animal animal = new Dog(numLegs, preferredClimate);

        System.out.println(animal.getAnimalInfo());


        Animal animal2 = new Cat(numLegs, catPreferredClimate);

        System.out.println(animal2.getAnimalInfo());


        Animal animal3 = new Fish(fishNumLegs, fishPreferredClimate);
        System.out.println(animal3.getAnimalInfo());

    }


}
