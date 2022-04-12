package util;

import java.util.Scanner;


public class Input {

//    ------------------- EXERCISE 1.----------------

    //PROPERTIES
    private Scanner scanner;

    //    CONSTRUCTOR

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    // GETTERS AND SETTERS

    public String getString() {
        System.out.println("Enter a string:");
        return this.scanner.nextLine();
    }

//    --------------------

    public boolean yesNo() {
        System.out.println("Enter a Yes or No:");
        String userAnswer = this.scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
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
        double userDec = this.scanner.nextFloat();
        if ((userDec >= min) && (userDec <= max)) {
            System.out.println("Perfect, good choice in decimal.");
        } else {
            System.out.println("Nope, try again");
            return getDoubleRange(min, max);
        }
        return userDec;
    }

    //    --------------------

    double getDouble(){
        System.out.println("Enter an number in decimal format.");
        return this.scanner.nextFloat();
    }





}
