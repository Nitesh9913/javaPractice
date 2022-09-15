package loopPractice;

public class PracticeForMultiplication {

    public static void multiplication(int from ,int to){

        for (int i=from;i<=50;++i){
            int a=(i+1);
            System.out.println(i+"*"+(i+1)+"="+(i*a));
        }

    }

    public static void main(String[] args) {
        multiplication(1,50);
    }
}
