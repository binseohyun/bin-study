package d04.iterate;

public class Formain5 {
    public static void main(String[] args) {
        int k = 1;
        // 안티패턴(좋지 않은 패턴)
        Outter: for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++, k++) {
                if (i * j >= 25)
                    break;
                //break Outter;
                System.out.printf("i(%d) * j(%d) = %d\n", i, j, i * j);
            }
        }
        System.out.println("k =" + k);
    }

    }

