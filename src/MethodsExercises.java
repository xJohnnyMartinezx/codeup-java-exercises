import java.util.Scanner;

public class MethodsExercises {


//    -------------Exercise 1.----------------------

    public static void main(String[] args) {
        int add = addition(10, 4);
        System.out.println(add);

        int sub = subtraction(10, 4);
        System.out.println(sub);

        int mul = multiplication(10, 4);
        System.out.println(mul);

        double div = division(10, 4);
        System.out.println(div);

        int modulus = mod(10,4);
        System.out.println(modulus);

        System.out.println(getInteger(1, 15));


        boolean userContinue = true;

        do {
            System.out.println(getUserInteger(1, 10));
            userContinue = userContinue();

        } while (userContinue);

        rollDice();

    }


    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
    public static int mod (int x, int y) {
        return x % y;
    }

    //    -------------Exercise 2.----------------------


    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.println("Perfect!");

        } else {
            System.out.println("Number entered is outside of specified range. Try again.");
            return getInteger(min, max);
        }
        return userInput;
    }

//    -------------Exercise 3.----------------------

//            ----------Getting User Input and Printing Factorial---------
    public static long getUserInteger(long min, long max) {
        System.out.println("Enter an integer between " + min + " and " + max + ": ");
        Scanner sc = new Scanner(System.in);
        long userInteger = sc.nextInt();

        if (userInteger >= min && userInteger <= max) {
            System.out.println("Perfect! the factorial of " + userInteger + " is:");
            return getFactorial(userInteger);

        } else {
            System.out.println("Integer entered is outside of specified range. Try again.");
            return getUserInteger(min, max);
        }
    }

    public static long getFactorial(long userInteger) {

        if (userInteger < 2) {
            return 1;
        } else {
            return userInteger * getFactorial(userInteger - 1);
        }
    }

//            ---------Asking User if they wan to Continue------------
    public static boolean userContinue() {
        System.out.println("Would you Like to continue?");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.next();

        if (userAnswer.equalsIgnoreCase("y")) {
            return true;

        } else {
            System.out.println("OK bye, Felicia");
            return false;
        }
    }

//    -------------------Exercise 4.----------------------

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        boolean RollDice = true;
        do {
            System.out.println("Would you like to roll the dice? type y or n");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("y")) {
                System.out.println("How many total sides are on each dice?");
                int numberOfSides = scanner.nextInt();
                int diceOne = getNumber(numberOfSides);
                int diceTwo = getNumber(numberOfSides);
                System.out.printf("Your rolled a %d and a %d \n", diceOne, diceTwo);
            } else {
                System.out.println("have a good day!");
                RollDice = false;
            }
        } while(RollDice);
    }
    public static int getNumber(int numSides) {
        int rolledNumber = (int) (Math.random() * numSides + 1);
        return rolledNumber;
    }

    //    -------------------Exercise 5.----------------------





}
