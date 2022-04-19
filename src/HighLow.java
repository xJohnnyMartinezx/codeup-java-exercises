import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HighLow {
    Scanner sc = new Scanner(System.in);



    public int randomNum(){
        System.out.println();
        int rNum = (int) (Math.random() * (100 - 1)) + 1;
        return rNum;
    }




    public static void main(String[] args) {

        HighLow highLow = new HighLow();
        System.out.println(highLow.randomNum());

    }

}


