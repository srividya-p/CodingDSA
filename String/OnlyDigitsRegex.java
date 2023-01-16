package String;

import java.util.regex.Pattern;

public class OnlyDigitsRegex {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("[0-9]"); //Single Character in range 
        System.out.println(pattern.matcher("1").matches());

        Pattern pattern1 = Pattern.compile("[0-9]{2}"); //N occurances of Characters in range 
        System.out.println(pattern1.matcher("12").matches());
    }
}
