import java.util.Scanner;

public class ControlStatementLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        int x = 5;
//        System.out.println(x != 5);
//
//        int userAccessLevel = 0;
//
//        if (userAccessLevel == 0) {
//            System.out.println("user is Admin");
//        } else if (userAccessLevel == 1) {
//            System.out.println("user no access");
//        } else {
//            System.out.println("user is a visitor");
//        }
//
//
//        //        --------------switch cases--------------
//        boolean continueRunning = true;
//
//        do {
//            System.out.println("welcome to cool app");
//            System.out.println("--------------------");
//            System.out.println("what would you like to do");
//            System.out.println("1. see stuff");
//            System.out.println("2. do stuff");
//            System.out.println("3. exit");
//
//            int userResponse = scanner.nextInt();
//
//            switch (userResponse) {
//
//                case 1:
//                    System.out.println("youre seeing stuff");
//                    break;
//                case 2:
//                    System.out.println("youre doing stuff");
//                    break;
//                case 3:
//                    System.out.println("bye");
//                    continueRunning = false;
//                default:
//                    System.out.println("thats not an option");
//            }
//        } while (continueRunning);
//        System.out.println("exiting loop");
//
//

//        -----------------Example-----------
        int inTransaction = 0;
        int walletBalance = 150;
        int transactionAmount;

//        IN TRANACT MUST BE ZERO TO START
        if (inTransaction){

//            CONTINUE LOOP WHILE WALLET BAL IS MORE THAN FIVE
            while (walletBalance > 5) {
                System.out.println("making transact");
                System.out.println("wallet bal b4 transact: " + walletBalance);
                walletBalance -= transactionAmount;
                System.out.println("wall bal post transact" + walletBalance);
            }
        }


    }
}


