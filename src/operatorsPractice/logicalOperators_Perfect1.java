package operatorsPractice;

public class logicalOperators_Perfect1 {

    public static boolean logicalMethod(){
        int x = 98;
        int y  = 23;
        boolean z= x>y;
        System.out.println(x>5 && y<21);
        System.out.println(x<=17 && y>=43);
        System.out.println( !(x==98 || y>23));
        System.out.println(x<1 || y>1);//if I wish to derive these cases in main method then how
        return z;
    }

    public static void main(String[] args) {
        System.out.println(logicalMethod());


    }
}
