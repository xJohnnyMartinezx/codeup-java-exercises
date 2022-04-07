
//------FYI------------COMMITTED CHANGES AFTER EACH EXERCISE, BUT DID NOT REPLACE CODE AS STATED IN INSTRUCTIONS.
//----------------- I WOULD LIKE TO USE ALL OF THESE EXERCISES AS A REFERENCE.

import javax.swing.*;
import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

////        -------------1a----------------
//
////        int i = 5;
////        while (i <= 15) {
////            System.out.println(i++);
////        }
//
////        -------------1b----------------
////        -----count by 2's starting with 0---------
//         int j = 0;
//        do { j++;
//            if (j %2 == 0){
//                System.out.println(j);
//            }
//        } while (j <= 100);
//
//// -----count backwards by 5's from 100 to -10---------
//        int z = 100;
//        do { z-=5;
//            System.out.println(z);
//        } while (z > -10);
//
////------------Third Bullet Point---------
//        long a = 2;
//        do {
//            System.out.println(a);
//            a *= a;
//        } while (a < 1000000);
//
////---------Refactor the previous two exercises to use a for loop instead.-------------
//        for (int q = 100; q >= -10; q-=5){
//            System.out.println(q);
//        }
//
//        for (long w = 2; w < 1000000; w *= w) {
//            System.out.println(w);
//        }
//
//        --------------2----------------

//        ------Write a program that prints the numbers from 1 to 100.-----
//        for (int r = 1; r <= 100; r++){
//            System.out.println(r);
//        }

//        ----For multiples of three: print “Fizz” instead of the number.-----
//        for (int t = 1; t <= 100; t++){
//            if (t % 3 == 0 && t % 5 == 0){
//                System.out.print("FizzBuzz\n");
//                continue;
//            } else if (t %3 == 0) {
//                System.out.print("Fizz\n");
//                continue;
//            } else if (t %5 == 0){
//                System.out.print("Buzz\n");
//                continue;
//            }
//            System.out.println(t);
//        }

//        ------------3--------------
        Formatter fmt;
        System.out.println("Please enter a number:");
        int userInput = scanner.nextInt();


        for (int i = 1; i <= userInput; i++) {
            fmt = new Formatter();

            fmt.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(fmt);
        }






    }
}
