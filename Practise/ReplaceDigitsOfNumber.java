

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class ReplaceDigitsOfNumber {
    public static void main(String[] args) {

        ReplaceDigitsOfNumber replaceDigitsOfNumber = new ReplaceDigitsOfNumber();

        // Make calls to the function to test both positive and negative integers
        System.out.println(replaceDigitsOfNumber.doubleDigits(-290));
        System.out.println(replaceDigitsOfNumber.doubleDigits(348));

    }

    // Function accepts a number and returns integer by replacing every digit of number with two of that digit.
    public long doubleDigits(long number)
    {


        if(number==0)
        {
            return 0;
        } else {
            long lastDigit=number%10;
            return 100 * doubleDigits(number/10)+10*lastDigit+lastDigit;
        }






    }}