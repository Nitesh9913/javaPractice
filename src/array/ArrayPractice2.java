package array;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int number[] = {1, 3, 5, 7, 9, 11, 13};

        int sum = 1;
        for (int i = 0; i < number.length; i++) {
            sum=sum * number[i];
            System.out.println(sum);
        }
    }
}
