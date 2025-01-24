package d05;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] scores = new int[10];
        Arrays.fill(scores,-1);
        System.out.println(scores[0]);
        System.out.println(scores[9]);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        Integer[] scores2 = new Integer[10];
        scores2[2] = null;
        System.out.println(scores2[0]);

        int[] age = {10, 20, 30};

        int[] heights = new int[3];
        heights[0] = 100;

        int[] widths = new int[] {100, 200, 300};
        widths = null;
    }
}
