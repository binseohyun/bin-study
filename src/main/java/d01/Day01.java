package d01;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String name = scanner.next();
        System.out.println("헬로");
        System.out.println("name = " + name);
    }
}
