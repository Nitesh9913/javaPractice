package loopPractice;

public class ForLoopTable {


    public static void indexOf19(int tablenumber) {
        System.out.println("Table number for" + tablenumber);
        for (int a = 1; a <= 10; ++a) {
            System.out.println(tablenumber + "X" + a + "==" + tablenumber * a);
        }
    }

    public static void main(String[] args) {
        indexOf19(19);

    }
}
