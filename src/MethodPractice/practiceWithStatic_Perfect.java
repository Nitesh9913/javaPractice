package MethodPractice;

public class practiceWithStatic_Perfect {

    public static float division() {
        float a = 12.331f;
        byte b = 2;
        float c = a / b;
        return c;
    }

    public static String myFullName() {
        String myName = "Viral ";
        String lastName = "patel";
        String fullName = myName + lastName;
        return fullName;
    }

    public static int modules() {
        int x = 76;
        int y = 21;
        int z = x % y;
        return z;
    }

    public static int addTwoNumbers(int x, int y) { //if I want to add any values and want sum of those values
        int a = x + y;
        System.out.println(a);
        return a;
    }


    public static void main(String[] args) {
        System.out.println(division());
        System.out.println(myFullName());
        System.out.println(modules());
        System.out.println(addTwoNumbers(5, 12));
    }
}
