package d04.condition;

import java.util.Scanner;

public class ConditionMain2 {
    public static void main(String[] args) {
        String alphabet;
        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳을 입력해주세요: ");
        alphabet = scanner.next();

        if(alphabet.length() > 1){
            System.out.println("한 글자만 입력해주세요");
            return;
        }

        switch (alphabet.charAt(0)){
            case  'A': case 'a':{
                System.out.println("알파벳 a or A");
                break;
            }
            case 'B': case 'b':{
                System.out.println("알파벳 b or B");
                break;
            }
            default:
                System.out.println("아무 값도 아님");
        }

    }
}
