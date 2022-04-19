package movies;

import java.util.Objects;
import java.util.Scanner;
import util.Input;
public class MoviesApplication {


    //    --------MAIN METHOD----------
    public static void main(String[] args) {

//        --------CALLING userChoice METHOD-------
        userChoice();
    }

    public static void userChoice() {
        Movie[] movies = MoviesArray.findAll();
        Input userSelection = new Input();
        int num;
//----------------------------------COMPLETED USING IF STATEMENTS--------------------------
//        do {

//            System.out.println("Please make a selection from the list below...");
//            System.out.println("0 - exit \n1 - view all movies \n2 - view movies in the animated category \n3 - view movies in the drama category \n4 - view movies in the horror category \n5 - view movies in the scifi category");
//            System.out.println("Enter a choice: ");
//
//            num = userSelection.scanner.nextInt();
//
//            if (num == 1) {
//                for (int i = 0; i < movies.length; i++) {
//                    System.out.println(movies[i].getName() + " ---- " + movies[i].getCategory());
//                }
//            } else if (num == 2) {
//                for (int i = 0; i < movies.length; i++) {
//                    if (movies[i].getCategory() == "animated") {
//                        System.out.println(movies[i].getName() + " ---- " + movies[i].getCategory());
//                    }
//                }
//            } else if (num == 3) {
//                for (int i = 0; i < movies.length; i++) {
//                    if (movies[i].getCategory() == "drama") {
//                        System.out.println(movies[i].getName() + " ---- " + movies[i].getCategory());
//                    }
//                }
//            } else if (num == 4) {
//                for (int i = 0; i < movies.length; i++) {
//                    if (movies[i].getCategory() == "horror") {
//                        System.out.println(movies[i].getName() + " ---- " + movies[i].getCategory());
//                    }
//                }
//            } else if (num == 5) {
//                for (int i = 0; i < movies.length; i++) {
//                    if (movies[i].getCategory() == "scifi") {
//                        System.out.println(movies[i].getName() + " ---- " + movies[i].getCategory());
//                    }
//                }
//            }
//        } while (num != 0);
//    }
//}
//        --------------------------------------------------------------------------------------------------------

        //----------------------------------COMPLETED USING SWITCH CASE--------------------------
        boolean continueRunning = true;

        do {
            System.out.println("Please make a selection from the list below...");
            System.out.println("0 - exit \n1 - view all movies \n2 - view movies in the animated category \n3 - view movies in the drama category \n4 - view movies in the horror category \n5 - view movies in the scifi category");
            System.out.println("Enter a choice: ");
            num = userSelection.scanner.nextInt();

            switch (num) {
                case 0:
                    System.out.println("OK, bye Felicia!");
                    continueRunning = false;

                case 1:
                    if (num == 1) {
                        for (Movie movie : movies) {
                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
                        }
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " ---- " + movie.getCategory());
                        }
                    }
                default:
                    System.out.println("that's not an option");
            }
        } while (continueRunning);
        System.out.println("exiting loop");
    }
}


