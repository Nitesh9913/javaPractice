package array;

public class ArrayMyName {

    public static void main(String[] args) {

        int storingNumbers[]={1,3,4,6,9};
        String myName[]={"nitesh","babubhai","patel"};

        System.out.println(storingNumbers.length);
        System.out.println(myName.length);
// you can change the value and name by adding in array
        for (int x:storingNumbers){
            System.out.println(x);
        }
        for (String y:myName){
            System.out.println(y);
        }
    }
}
