package if_Else;

public class OddEven {

    public static void oddEvenNumbers(int x){
        if (x%2==0){
            System.out.println("X is Odd number");
        }
        else {
            System.out.println("X is Even number");
        }
    }

    public static void main(String[] args) {
        oddEvenNumbers(13);

    }
}
