public class HelloWorld {

//    SHORTCUT psvm
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        ----------1------------
        int myFavoriteNumber = 18;
        System.out.println(myFavoriteNumber);


//        ----------2------------
        String myString = "This is a string";
        System.out.println(myString);


//        ----------3------------
//        char myStringTwo = "This is a string";
//        System.out.println(myStringTwo);
//        ^^ java: incompatible types: java.lang.String cannot be converted to char

//        ----------4------------
//        String myStringThree = 3.14159;
//        System.out.println(myStringThree);
//        ^^ java: incompatible types: double cannot be converted to java.lang.String


//        ----------5------------
//        long myNumber;
//        System.out.println(myNumber);
//        ^^ java: variable myNumber might not have been initialized


//        ----------6------------
//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        ^^ java: incompatible types: possible lossy conversion from double to long


//        ----------7------------
        long myNumber = 123L;
        System.out.println(myNumber);


//        ----------8------------
        long myNumbertwo = 123;
        System.out.println(myNumbertwo);
//        STILL ^^ LOGS TO CONSOLE


//        ----------9------------
        float myNumberThree = 3.14F;
        System.out.println(myNumberThree);


//        ----------10------------
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int z = 5;
        System.out.println(++z);
        System.out.println(z);


//        ----------11------------
//        int class = 6;
//        System.out.println(class);
////        java: ^^ not a statement

//
//        ----------12------------
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        ^^ Exception in thread "main" java.lang.ClassCastException: class java.lang.
//     String cannot be cast to class java.lang.Integer
//     (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//    	at HelloWorld.main(HelloWorld.java:61)

//        int three = (int) "three";
//        ^^ java: incompatible types: java.lang.String cannot be converted to int


//        ----------13------------
        int j = 4;
//        x = x + 5;
        System.out.println(j+=5);

        int a = 3;
        int y = 4;
//        y = y * x;
        System.out.println(y*=a);

        int b = 10;
        int c = 2;
//        x = x / y;
//        y = y - x;
        System.out.println(b/=c);
        System.out.println(c-=b);



//        ----------14------------

//        int overflow = Integer.MAX_VALUE




    }

}
