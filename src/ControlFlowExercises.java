public class ControlFlowExercises {
    public static void main(String[] args) {

//        -------------1a----------------

        int i = 5;
        while (i <= 15) {
            System.out.println(i++);
        }

//        -------------1b----------------
        int j;
        do {
            for(int j = 0; j < 100; j++) {
                System.out.println(j);
            }

            System.out.println(j);
        } while (j <= 100);


    }


}
