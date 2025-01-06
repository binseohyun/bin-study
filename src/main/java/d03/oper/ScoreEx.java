package d03.oper;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요: ");
        int score = scanner.nextInt();
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);
    }
}
