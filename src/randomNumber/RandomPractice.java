package randomNumber;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {

        Random myRandom = new Random();
        int myRandomNumber = myRandom.nextInt();

        //we can derive in both ways:
        System.out.println(myRandomNumber);
        System.out.println(myRandom.nextInt(100));

        String myEmail="nitesh"+"patel"+myRandomNumber+"@gmail.com";
        System.out.println(myEmail);
    }
}
