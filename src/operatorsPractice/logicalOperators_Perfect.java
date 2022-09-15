package operatorsPractice;

public class logicalOperators_Perfect {

    public static int myNumbers() {
        int a = 45;
        int b = 12;
        int c = a + b;
        System.out.println(a < 34 && b > 42); //false && false
        System.out.println(a > 32 && b < 10); //true && false
        return c;
    }

    public int logicalOperators() {
        int x = 12;
        int y = 23;
        int z = x - y;
        ++x;
        --y;
        System.out.println(x <= 7 && y >= 12);
        System.out.println(x >= 11 && y <= 54);
        return z;
    }

    public static void main(String[] args) {
        System.out.println(myNumbers());
        logicalOperators_Perfect value1 = new logicalOperators_Perfect();
        System.out.println(value1.logicalOperators());


    }
}
