package Outer_In;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reegx {
    public static void main(String[] args) {
        // String regex="J..v";
        // System.out.println("Jaav".matches(regex));
        // String reegxx="^[1-9]+$";
        // System.out.println("97545454545484".matches(reegxx));

        //
        // Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        // Matcher matcher= pattern.matcher("Jaava");
        // Matcher matcher1= pattern.matcher("Jaaba");
        // boolean matchfound=matcher.find();
        // boolean matchfound1=matcher1.find();
        Pattern p=Pattern.compile("^([9]{1})([234789]{1})([0-9]{8})$");
        Matcher m=p.matcher("918887984694");
        System.out.println(m);
        // if(matchfound){
        //     System.out.println("true");

        // }
        // else
        //     System.out.println("False");

        // if(matchfound1){
        //     System.out.println("true");

        // }
        // else
        //     System.out.println("False");

    }


}

