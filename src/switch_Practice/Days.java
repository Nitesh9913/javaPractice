package switch_Practice;

public class Days {

    public static void checkWeekdays(int daysNumbers ){
        switch (daysNumbers){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thursday");
            case 4:
                System.out.println("Saturday");
            default:
                System.out.println("You have entered invalid number");
        }
    }

    public static void main(String[] args) {
        checkWeekdays(8);
    }
}
