package if_Else;

public class LeapYear {

    public static void checkLeapYear(int year){
        if (year%4==0){
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is not leap year");
        }
    }

    public static void main(String[] args) {
        checkLeapYear(1996);
    }

}
