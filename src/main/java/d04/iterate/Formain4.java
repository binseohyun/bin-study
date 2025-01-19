package d04.iterate;

public class Formain4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
           // if (i == 5) {
            //    break;
            //}
            //System.out.println("i =" + i);

            if(i % 2 ==1){ //홀수(odd)
                continue; // 아래 코드를 실행하지 않고 다시 위로 감
            }
            sum += i;
            System.out.println("i = " + i);
        }
        System.out.println("sum =" + sum);

        sum = 0;
        for (int i = 2; i <= 10 ; i+= 2) {
            sum += 1;
        }
        System.out.println("sum =" + sum);
    }

}
