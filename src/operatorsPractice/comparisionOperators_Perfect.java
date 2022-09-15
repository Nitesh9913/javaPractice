package operatorsPractice;

public class comparisionOperators_Perfect {

    public static int comparision() {
        int a = 21;
        int b = 5;
        int c = a %= 4;//c=a%4=1
        int d = c % b;//d=1%5 why the answer comes different as not expected
        return d;
    }

    public int mixOperators() {
        int x = 63;
        int y = 21;
        int z = x *= 10;//z=x*10=73
        int z1 = y /= 5; // z1=y/5=4.2
        int z2 = z >>= z1;
        return z2;

    }

    public int eqaulOperator(){
        int a =32;
        int b= 10;
        float c= 12.4532f;
        int d=(a=b);
        System.out.println(a==d); //true
        System.out.println(c==d); //fslse
        System.out.println(a!=b); //false
        System.out.println(a>b); //false
        System.out.println(b<c); //true
        System.out.println(c>=a); // atlist 1 should be true
        System.out.println(d<=c);
        return d;


    }

    public static void main(String[] args) {
        System.out.println(comparision());
        comparisionOperators_Perfect m1 = new comparisionOperators_Perfect();
        System.out.println(m1.mixOperators());
        System.out.println(m1.eqaulOperator());
    }
}
