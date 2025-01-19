package d04.iterate;

public class ForMain {
    public static void main(String[] args) {
        int sum = 0;
        //for (int i = 1; i <= 100; i++) {
        //     sum += i;
        //}
        for (int i = 1; i <= 10 ; i+=2) {
            //sum += i;
        }
        // 1 + 3 + 5+ 7 + 9 = 25

        for (int i = 0; i <= 10; i+=2) {
            sum += i;
        }
        // 0 + 2 + 4 + 6 + 10 = 30

        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        // 3의 배수 (10번 순회)
        for (int i = 3; i <= 30; i*=3) {
            System.out.println(i);
        }
        // 3의 제곱 (3번 순회)
        System.out.println("sum =" + sum);
    }
}
