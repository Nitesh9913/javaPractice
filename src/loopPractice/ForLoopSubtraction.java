package loopPractice;

public class ForLoopSubtraction {

    public static void numbersSubtraction(int from,int to) {

        for (int i = from; i >= to; --i) {
            int a = i + 1;
            System.out.println(i + "-" + (i -1) + "==" + (i - a));
        }
    }

    public static void main(String[] args) {
        numbersSubtraction(50,1);
    }
}
// 50-49=1,49-48=1