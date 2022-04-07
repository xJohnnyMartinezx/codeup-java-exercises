import java.util.Scanner;

public class JavaWarmups {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        ---------------4/7/2022-----------------

        System.out.println("Do you live in Dallas? (y/n)");

        String userLivesInDallas = scanner.next();
        boolean livesInCity = true;


        if (userLivesInDallas.equalsIgnoreCase("Y")) {
            livesInCity = true;
        }else {
            livesInCity = false;
        }

        System.out.println("Do you have transp? (y/n)");

        String hasTransp = scanner.next();
        boolean hasTransportation = true;

        if (hasTransp.equalsIgnoreCase("Y")) {
            hasTransportation = true;
        }else {
            hasTransportation = false;
        }


        boolean canComeInPerson = livesInCity && hasTransportation;

        if (canComeInPerson) {
            System.out.println("yes can come");
        }else {
            System.out.println("no can't come");
        }

    }
}
