package d04.condition;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Integer score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요: ");
        score = scanner.nextInt();

        /*
        if(score >= 90){
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        }
        else {
            System.out.println("F");
        }

         */
        switch (score/10) {
            case 9: {
                System.out.println("A");
                break;
            }
            case 8: {
                System.out.println("B");
                break;
            }
            case 7: {
                System.out.println("C");
                break;
            }
            default: {
                System.out.println("F");
                break;
            }
        }
    }
}
