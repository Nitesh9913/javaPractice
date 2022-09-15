package calcPractice;

public class Calc2 {
    //without inheritance methods and variable can be accessed by object creation from other and current class
    public static void main(String[] args) {
        Calc1 deriveInAnotherClass = new Calc1();
        deriveInAnotherClass.myFatherName();
        deriveInAnotherClass.modules();

        //if the method is static then we can derive it directly by class name.
        Calc1.multiplication(4,7);
    }
}
