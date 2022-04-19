import java.util.Random;

public class ServerNameGenerator {

    //    *****************EXERCISE 2.**********************

    //    ----------MAIN METHOD----------
    public static void main(String[] args) {

//    ------ADJECTIVES ARRAY--------
        String[] adjArr = {"Happy", "Harsh", "Healthy", "Heavy", "Helpful", "Hilarious", "Historical", "Horrible"};

//    ------NOUNS ARRAY--------
        String[] nounsArr = {"Air", "Area", "Art", "Back", "Body", "Book", "Brother", "Business", "Car", "Case"};


//-----PRINTS RANDOM ADJ----------
//        System.out.println(randomElement(adjArr));
//-----PRINTS RANDOM NOUN---------
//        System.out.println(randomElement(nounsArr));

        System.out.println("Here is your server name: " + randomElement(adjArr) + "-" + randomElement(nounsArr));
    }

    //----------PICKS RANDOM STRING FROM WHICHEVER ARR IS CALLED------------
    public static String randomElement(String[] adjArr) {
        Random element = new Random();
        int randomNumber = element.nextInt(adjArr.length);
        return adjArr[randomNumber];
    }
}
