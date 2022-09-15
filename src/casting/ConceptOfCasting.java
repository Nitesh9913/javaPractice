package casting;

public class ConceptOfCasting {

    public static void main(String[] args) {
        //   wide casting
        int myInt = 123;
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);
        //automatic casting:you can directly go smaller to bigger

        //narrow casting

        double myDouble1 = 9.23;
        System.out.println(myDouble1);
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);
        //this is the way of converting bigger to smaller
        byte myByte = (byte) myDouble1;
        System.out.println(myByte);

    }
}

