package string;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

        String myName = "Niteshhhhhhhh";
        String lastName = "Patel";

        System.out.println(myName.length());
        System.out.println(myName.charAt(0));
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.concat(lastName));
        System.out.println(myName+""+lastName);
    }
}
