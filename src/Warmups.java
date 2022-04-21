import util.Input;

import java.util.Locale;
import java.util.Scanner;

public class Warmups {

    static Input input = new Input();

//    Create a Warmup.java class with a main method
//            Create a method (isPalindrome) to determine if a string is a palindrome (do not define this in your main method and make sure it’s within the class)
//    It should return a boolean
//    It should accept a String as an argument
//    Think of how to use the String class’ methods to help accomplish this
//    Invoke isPalindrome in your main method, outputting its return value to the console with a contextual message

    public static void main(String[] args) {
        userInputCheck();


    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static String userPalindrome() {
        System.out.println("\nplease enter a Palindrome");
        return input.getString().toLowerCase(Locale.ROOT);

    }

    public static void userInputCheck() {
        if (isPalindrome(userPalindrome()))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
    }


}


