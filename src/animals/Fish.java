package animals;

public class Fish extends Animal {

    private boolean hasGills = true;


    //    constructor
    public Fish(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public void setHasGills(boolean needsAttention) {
        this.hasGills = needsAttention;
    }

    @Override
    public String getAnimalInfo() {
        return "Fish Details:"  + "Num of Legs: " + numberOfLegs + " Preferred Climate: " + preferredClimate;
    }

}
