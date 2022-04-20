package animals;

public class Dog extends Animal{

    private boolean needsAttention = true;


//    constructor
    public Dog(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);
    }

    public boolean isNeedsAttention() {
        return needsAttention;
    }

    public void setNeedsAttention(boolean needsAttention) {
        this.needsAttention = needsAttention;
    }

    @Override
    public String getAnimalInfo() {
        return "Dog Details:"  + "Num of Legs: " + numberOfLegs + " Preferred Climate: " + preferredClimate;
    }
}
