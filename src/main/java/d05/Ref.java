package d05;

public class Ref {
    public static void main(String[] args) {
        String s1 = new String("빈서현");
        String s2 = new String("빈서현");

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
