package animals;

public abstract class Animal {
    //    # Inheritance and Polymorphism Bonus
//
//    Create an abstract class of Animal
//
//- add the following fields:
//            - ```private int numberOfLegs```
//            - ```private String prefferedClimate```
//            - ```public String getAnimalInfo()```: a method that returns a message with number of legs and preferrered climate info
//- add getters and setters
//- add a constructor that sets all properties
//
//    Create a class of Dog, Fish, Cat that extends Animal
//
//- add additional private properties that are unique to each specific animal type and getters and setters for these properties
//- overload the getAnimalInfo() to invoke the parent getAnimalInfo() method and return extra info on all the additional properties for the specific animal type
//- add a constructor that invokes the parent constructor and sets new properties
//
//    Create a class AnimalTester with a method ```public static void displayAnimalDetails(Animal a)``` that prints what is returned from calling the getAnimalInfo() method for a given animal object
//
//- this method should take in any Animal object but test it in the main method
//    with instantiated Dog, Fish, Cat objects of type Animal.
//


//    TYPICALLY WE DO NOT ADD A MAIN METHOD OR ANY STATIC METHODS TO THE POGO.


//    FIELDS
    protected int numberOfLegs;
    protected String preferredClimate;

//    CONSTRUCTOR
    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }

    public Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(){

    }

//    PROPERTIES
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    abstract String getAnimalInfo();

}
