package calcPractice;

public class Calc1 {

    public String myFatherName() {
        String firstName = "Babubhai ";
        String lastName = " Patel";
        String fullNamMe = firstName + lastName;
        System.out.println(fullNamMe);
        return fullNamMe;
    }

    public float modules() {
        byte a = 12;
        long b = 5;
        float c = a % b;
        System.out.println(c);
        return c;

    }

    public static void multiplication(int a ,int b){
        System.out.println(a*b);

    }
}

