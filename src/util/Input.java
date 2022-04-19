package util;

import java.util.Scanner;


public class Input {

//    ------------------- EXERCISE 1.----------------

    //PROPERTIES
    public Scanner scanner;

    //    CONSTRUCTOR

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    // GETTERS AND SETTERS

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

//    --------------------

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userAnswer = this.scanner.nextLine();
        return userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y");
    }

    //    --------------------

    int getIntRange(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max + ": ");
        int userInt = this.scanner.nextInt();
        if ((userInt >= min) && (userInt <= max)) {
            System.out.println("Perfect, good choice.");
        } else {
            System.out.println("Nope, try again");
            return getIntRange(min, max);
        }
        return userInt;
    }

    //    --------------------
    int getInt(){
        System.out.println("Enter an integer");
        return this.scanner.nextInt();
    }

    //    --------------------

    double getDoubleRange(double min, double max){
        System.out.println("Enter decimal between " + min + " and " + max + ": ");
        double userDec = this.scanner.nextDouble();
        if ((userDec >= min) && (userDec <= max)) {
            System.out.println("Perfect, good choice in decimal.");
        } else {
            System.out.println("Nope, try again");
            return getDoubleRange(min, max);
        }
        return userDec;
    }

    //    --------------------

    public double getDouble(String prompt){
        System.out.println(prompt);
        return this.scanner.nextDouble();
    }
}
