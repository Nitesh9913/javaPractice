package switch_Practice;

public class SwitchForMonth {

    public static void checkMonths(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("may");
            case 4:
                System.out.println("September");
                break;

            case 5:
                System.out.println("November");
            case 6:
                System.out.println("August");
        }
    }

    public static void main(String[] args) {
        checkMonths(3);
    }
}
