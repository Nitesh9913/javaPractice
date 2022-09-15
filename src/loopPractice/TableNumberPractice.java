package loopPractice;

public class TableNumberPractice {

    public static void tableNumber(int tablenumber){

        System.out.println("My table for" + tablenumber );
        for (int i=1;i<=10;i++){
            System.out.println(tablenumber+"X"+i+"=="+tablenumber*i);
        }
    }

    public static void main(String[] args) {

        tableNumber(15);
    }
}
