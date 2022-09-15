package if_Else;

public class Parametrised_if_else_Perfect {

    public static void compare(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("X is bigger");
        } else if (y > z && y > z) {
            System.out.println("y is bigger");

        } else {
            System.out.println("Z is bigger");
        }
    }

    public static void main(String[] args) {
        compare(21,32,41);
        compare(54,43,33);
        compare(409,543,121);
    }
}
