package loopPractice;

public class Practice_1 {

    public static void addingNumbers(int from ,int to){

        for (int i=from; i<=to;i=i+1){
            int a=(i+1);
            System.out.println(i+"+"+(i+1)+"="+(i+a));

        }
    }// 1+2=3, 2+3=5,4+5=9

    public static void main(String[] args) {
        addingNumbers(1,50);
    }
}
