public class SyntaxTypesVariable {
    public static void main(String[] args) {

//        JS VARIABLE DECLARATION
//        let something = value

//        JAVA VARIABLE DECLARATION
//        DATATYPE -> NAME = VALUE


//        TRY TO PICK LOGICAL NUMBERS FOR byte AND short (numbers that are unlikely to change or go past the byte or short limit)
//        SYNTAX:
//    dataType   name     value
        byte daysInMonth = 31;

        short daysInYear = 365;

//        int userID HAS THE POSSIBILITY TO CHANGE/GROW IN THE FUTURE
        int userID = 100000;

        long circMilkyWay = 100000000000L;


        float roundedPi = 3.14f;

        double someBigDecimal = 3.14154856515;

//        SINGLE CHARACTER

        char yesNo = 'Y';

        boolean isTrueOrFalse = true;

//        STRINGS DECLARATIONS

        String myString = "Some String";

        String someQuote = "\"Some cliche quote\" -Mark Twain";
        System.out.println(someQuote);


//        CONSTANTS

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";


    }
}
