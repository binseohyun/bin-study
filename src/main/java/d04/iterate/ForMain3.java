package d04.iterate;

public class ForMain3 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i++ < 10){
            sum += i;
            //i++;
        }
        System.out.println("sum =" + sum);

        int j = 1, sum2 = 0;
        while (j <= 10){
            System.out.println("j = " + j);
            sum2 += j;
            j++;
        }
        System.out.println("sum2 = " + sum2);
    }
}
