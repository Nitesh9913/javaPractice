package homework;

public class For_Loop_Practice {

    public static void countLeapYear(int from, int to) {

        for (int a = from; a <= to; a += 4) {
            if (a % 4 == 0) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        countLeapYear(1400, 2000);
    }
}
