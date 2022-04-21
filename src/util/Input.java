package util;

import java.util.Scanner;


public class Input {

//    ------------------- EXERCISE 1.----------------

    //PROPERTIES
    public static Scanner scanner;

    //    CONSTRUCTOR

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    // GETTERS AND SETTERS

    public String getString() {
//        System.out.println(prompt);
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
        System.out.println("Please enter an integer.");
        try{
            return Integer.parseInt(getString());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
            System.out.println("Input is not an integer");
        }
        return getInt();
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

    public double getDouble(){
        System.out.println("Please enter an decimal.");
        try{
            return Double.parseDouble(getString());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
            System.out.println("Input is not an decimal");
        }
        return getDouble();
    }

    public static boolean hasNewLine(){
        return scanner.hasNextLine();
    }

//    public int getBinary(){
//        System.out.println("Please enter a binary num...");
//        try {
////            String binaryString = "10010";
//            int foo = Integer.parseInt(getString(), 2);
//
//            System.out.println(foo);
//        } catch (NumberFormatException e) {
//            System.out.println("Error: The binary string is not valid");
//            return getBinary();
//        }
//
//        return 0;
//    }
}
