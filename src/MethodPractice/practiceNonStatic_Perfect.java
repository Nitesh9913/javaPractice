package MethodPractice;


public class practiceNonStatic_Perfect {

    public String myFatherName() {
        String firstName = "Babubhai ";
        String lastName = " Patel";
        String fullNamMe = firstName+lastName;
        return fullNamMe;
    }

    public float modules() {
        byte a = 12;
        long b = 19284432;
        float c = a % b;
        return c;
    }

    public static void main(String[] args) {
        practiceNonStatic_Perfect obj1 = new practiceNonStatic_Perfect();
        System.out.println(obj1.myFatherName());
      //  System.out.println(obj1.myHomeAddress());
       // System.out.println(obj1.myAnswer());
        System.out.println(obj1.modules());

    }
}