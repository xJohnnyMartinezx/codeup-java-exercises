

package animals;

// this interface allows Animals to exhibit audible behaviors based on a situation
public interface Audible {

    void makePassiveSound() throws Exception;
    void makeAggressiveSound() throws Exception;
    void makeHappySound() throws Exception;
}