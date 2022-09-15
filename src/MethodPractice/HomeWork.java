package MethodPractice;

public class HomeWork {

    static int x=5;
    static int y=10;
    static int sum=x+y;

    public static byte add() {
        int x = 5;
        int y = 765;
        float z = 90.3231f;
        float a = (x + y + z);
        System.out.println(a);
        return 0;
    }

    public static int multi() {
        byte a = 21;
        short b = 3829;
        int c = 123456;
        byte d = 1;
        int x = a * b * c * d; //why byte is not using for short value
        System.out.println(x);
        return x;
    }

    public static String printMyName() {
        String myName = "Nitesh ";
        String mySurName = "Patel";
        String fullName = myName + mySurName;
        //System.out.println(fullName);
        return fullName;
    }

    public static void main(String[] args) {
        //practice1 practice1 = new practice1();
        //practice1.add();
        //practice1.multi();
        //practice1.printMyName();
       int z =  multi();
        System.out.println(sum);
       String fullName=printMyName();
        System.out.println(z);
        System.out.println(fullName);

    }
}
