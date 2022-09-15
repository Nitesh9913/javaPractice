package loopPractice;

public class For_Loop_1 {

    public static void countEvenNumber(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 2 == 0)
                System.out.println(i);//variable i becomes odd number after increment then how does it gives even values

            }
        }


    public static void main(String[] args) {
        countEvenNumber(100,1000);
    }
}
