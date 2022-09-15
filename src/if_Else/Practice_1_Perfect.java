package if_Else;

public class Practice_1_Perfect {

    public static void myMethod() {
        int accountBalace = 1000;
        int apple = 21;


        if (accountBalace > apple) {
            System.out.println("transcation successfull");
        } else {
            System.out.println("unsucessfull transaction");
        }

    }

    public void operators() {

        int a = 21;
        int b = 11;
        int c = 39;

        if (a>b && a<c){
            System.out.println("a is bigger");
        }
        else {
            if (b>a || b<c){
                System.out.println("b is bigger");
            }
            else {
                System.out.println("c is bigger");
            }
        }
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 21;

        if (a > b) {
            System.out.println("A is bigger");
        } else {
            System.out.println("B is bigger");
        }
        myMethod();
        Practice_1_Perfect obj1= new Practice_1_Perfect();
        obj1.operators();

    }


}

