package calcPractice;

public class InheritancePractice extends Calc1 {

    //inheritance is child class & calc1 is parent class
    //this class now has knowledge of this class as well as Calc1(parent class).
    // if we use inheritance we have to creat an object for that particular class(child class)

    public static void main(String[] args) {
        //without inheritance#
        Calc1 obj1 =new Calc1();
        obj1.modules();
        obj1.myFatherName();

//    through inheritance 
        InheritancePractice obj2 = new InheritancePractice();
        obj2.modules();
        obj2.myFatherName();
    }
}
