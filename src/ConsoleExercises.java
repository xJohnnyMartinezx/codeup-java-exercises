import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

//        -----------1------------
        double pi = 3.14159;

        System.out.format("The value of pi is approximately: %3.2f%n", pi);

//        ------------Explore the Scanner Class.------------

//        -----------1------------


        System.out.println("Enter a whole number: ");
        int userInputNum = Integer.parseInt(scanner.next());

//        ------------2------------
        System.out.printf("You entered: --> \"" + userInputNum + "\" <--%n");

        System.out.println("Enter three words:");
        System.out.println("Enter the first word:");
        String wordOne = scanner.next();
        System.out.println("Enter the second word:");
        String wordTwo = scanner.next();
        System.out.println("Enter the third word:");
        String wordThree = scanner.next();

        System.out.printf("The three word entered are:%n %s%n %s%n %s%n", wordOne, wordTwo, wordThree);
            scanner.nextLine();
//        -----------3------------
        System.out.println("Enter a sentence:");

        String sentence = scanner.nextLine();

        System.out.printf("The sentence you entered is: %n%s%n", sentence);


//        -------------Calculate the perimeter and area of Codeup's classrooms.--------------

//        -----------1------------

        System.out.println("Please enter a Width and Length:");
        System.out.println("Please enter a Width:");
        int userWidthInput = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a Length:");
        int userLengthInput = Integer.parseInt(scanner.next());

        int userArea = userLengthInput * userWidthInput;

        int userPeri = (userLengthInput * 2) + (userWidthInput * 2);

        System.out.printf("The area is: " + userArea + ".%n");
        System.out.printf("The perimeter is: " + userPeri + ".%n");

    }
}
