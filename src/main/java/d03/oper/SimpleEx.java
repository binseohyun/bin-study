package d03.oper;

public class SimpleEx {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        System.out.println("x = " + x);
        int result1 = ++x + 10;
        System.out.println("x = " + x);

        System.out.println("y = " + y);
        int result2 = y++ + 10;
        System.out.println("y = " + y);

    }
}
