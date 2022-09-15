package Arithmetic;

public class practiceWithDecrement_Perfect {

    public static double fiveValues() {
        byte a = 43;
        --a;
        short b = 453;
        b--;
        int c = 0123456;
        double d = 98763235;//double is not allowing to add 0 from the start
        --c;
        c--;
        --d;
        double e = 252232322;
        double f = (e - b - a - d - c);// I tried to use float here but it couldnt allow to process further
        f--;
        ++f;
        return f;
    }

    public int subtraction() {
        int a = 4532;
        int b = 21323;
        byte c = 0;
        c--;
        --b;
        --a;
        short d = 000000000000001;
        d--;
        d--;
        --d;
        int E = d - b - a - c;
        return E;
    }

    public static void main(String[] args) {
        practiceWithDecrement_Perfect value1 = new practiceWithDecrement_Perfect();
        System.out.println(value1.subtraction());
        System.out.println(fiveValues());
    }

}
