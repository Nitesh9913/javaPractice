package lecture_6_String_length;

import java.util.Locale;

public class class_Practice {

    public static void main(String[] args) {

        String myName = "Niteshhhhhhh";
        String lastName = " patelllls";

        //string is index based ,start with 0,1,2,3

        StringBuffer myMethod = new StringBuffer(myName);
        System.out.println(myMethod.reverse());
        System.out.println(myMethod.length());
        System.out.println(myName.charAt(3));
         System.out.println(lastName.indexOf('t'));
        System.out.println(myName.toLowerCase());
        System.out.println(lastName.toUpperCase(Locale.ROOT));
        System.out.println(myName.toUpperCase());
        System.out.println(myName.concat(lastName));

    }

}