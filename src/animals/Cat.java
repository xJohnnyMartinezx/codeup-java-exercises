package animals;

public class Cat extends Animal{

    private boolean isAMiniLion= true;


//    CONSTRUCTOR

    public Cat(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);
    }

    public boolean isIsMiniLion() {
        return isAMiniLion;
    }

    public void setIsMiniLion(boolean needsAttention) {
        this.isAMiniLion = needsAttention;
    }

    @Override
    public String getAnimalInfo() {
        return "Cat Details:"  + "Num of Legs: " + numberOfLegs + " Preferred Climate: " + preferredClimate;
    }



}
