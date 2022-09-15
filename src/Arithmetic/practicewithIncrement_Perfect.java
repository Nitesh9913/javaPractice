package Arithmetic;

public class practicewithIncrement_Perfect {

    public float increment(){
        int a = 132;
        byte b = 21;
        float c = 76.21300f;
        ++a;
        b++;
        float d = a+b+c;
        ++c;
        return d;
    }

    public double values(){
        byte x = 12;
        long y = 12345;
        double z= 1253546446;
        x++;
        z++;
        ++y;
        double N = x-y-z;
        N++;
        return N;

    }

    public static void main(String[] args) {
       practicewithIncrement_Perfect myNumbers = new practicewithIncrement_Perfect();
        System.out.println(myNumbers.increment());
        System.out.println(myNumbers.values());
    }
}
