package operatorsPractice;

public class assignmentOperators_Perfect {

    public static int twoValues() {
        int a = 234;
        int b = 521;
        int c = +3;  // c=c+3
        int d = (a += b += c); //
        return c;
    }

    public float threeValues() {
        int a = 45;
        int b = +876;// b=b+876
        float c = +213.43f; // c=c+213.43
        float x = b -= a += c;
        return x;
    }

    //public static void modules(){
        //int a= 284;
        //int b = 21;
       // int c = a%b;
       // int c %= 32;
   // }

    public static int myMethod(int x){
        x-=32; // x=x-32
        return x;
    }


    public static void main(String[] args) {
        System.out.println(twoValues());
        assignmentOperators_Perfect voidMethod = new assignmentOperators_Perfect();
        System.out.println(voidMethod.threeValues());
        System.out.println(myMethod(41));//unable to add decimal values in pera. method
    }
}
