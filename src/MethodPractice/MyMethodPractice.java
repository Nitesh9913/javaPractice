package MethodPractice;

public class MyMethodPractice {

    public static String printMyName() {
        String printMyName = "Nitesh";
        return printMyName;
    }

    public static float multi() {
        float a = 123.0654f;
        byte b = 2;
        int c = 121211111;
        float d = a * b * c;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(printMyName());
        System.out.println(multi());
    }
}
