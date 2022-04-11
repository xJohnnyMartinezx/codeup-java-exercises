import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ASK BOB A QUESTION.


        System.out.println("Lets have a conversation with Bob.");
        System.out.println("-----------------------------------");
        do {
            System.out.println("Start talking to Bob...");
            String userInputOne = sc.nextLine();
//        System.out.println(userInputOne);
            if (userInputOne.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInputOne.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInputOne.isBlank()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while (true);


//else {
//            System.out.println("That's not a question...Try again.");
//
//        }

//        } else if (userInputOne.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        } else if (userInputOne.isBlank()){
//            System.out.println("Fine. Be that way!");
//        } else {
//            System.out.println("Whatever.");
//        }
    }
}
