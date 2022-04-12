package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Input input1 = new Input();
        Input yesOrNo = new Input();
        Input minMax = new Input();
        Input getInt = new Input();
        Input decMinMax = new Input();
        Input decNum = new Input();
        System.out.println(input1.getString("Enter a string."));
        System.out.println(yesOrNo.yesNo());
        System.out.println(minMax.getIntRange(1,10));
        System.out.println(getInt.getInt());
        System.out.println(decMinMax.getDoubleRange(1,10));
        System.out.println(decNum.getDouble("Enter a decimal number."));


    }
}
