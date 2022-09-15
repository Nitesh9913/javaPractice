package array;

public class StoringNumbers {

    public static void main(String[] args) {

        double storingNumbers[] ={1.33,1.2,1.4,5,6,3,9};
        storingNumbers[2]=5;
        System.out.println(storingNumbers[2]);
        //thi si single dimensional array

        int storingNumbers2[][]= {{1,2,3,4},
                                  {5,6,7,8},
                                  {9,10,11,12}};
        // This is multi-dimensional array
        System.out.println(storingNumbers2[1]);

        //you can change the values but cannot extend those values

    }
}
