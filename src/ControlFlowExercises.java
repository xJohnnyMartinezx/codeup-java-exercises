
//------FYI------------COMMITTED CHANGES AFTER EACH EXERCISE, BUT DID NOT REPLACE CODE AS STATED IN INSTRUCTIONS.
//----------------- I WOULD LIKE TO USE ALL OF THESE EXERCISES AS A REFERENCE.

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        -------------1a----------------

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }

//        -------------1b----------------
//        -----count by 2's starting with 0---------
         int j = 0;
        do { j++;
            if (j %2 == 0){
                System.out.println(j);
            }
        } while (j <= 100);

// -----count backwards by 5's from 100 to -10---------
        int z = 100;
        do { z-=5;
            System.out.println(z);
        } while (z > -10);

//------------Third Bullet Point---------
        long a = 2;
        do {
            System.out.println(a);
            a *= a;
        } while (a < 1000000);

//---------Refactor the previous two exercises to use a for loop instead.-------------
        for (int q = 100; q >= -10; q-=5){
            System.out.println(q);
        }

        for (long w = 2; w < 1000000; w *= w) {
            System.out.println(w);
        }





    }
}
