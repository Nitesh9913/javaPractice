package practiceInClass;

public class staticVariablePractice_Perfect {

    public static void add() {
        int a = 5;
        int b = 17;
        int c = a + b;
        System.out.println(c);
    }

    public static int multi() {
        int a = 12;
        int b = 4;
        int c = a * b;
        return c;
    }

    public static String myName() {
        String a = "Nitesh ";
        String b = "Patel";
        String c=a+b;
        return c;

    }
    public static boolean answerType(){
        boolean a = true;
        return a;
    }

    public static void main(String[] args) {
        add();
        int d = multi();
        System.out.println(d);
        System.out.println(myName());
        System.out.println(answerType());
    }
}
