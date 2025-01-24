package d05;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
//        System.out.println(arr.length); // Row : 9줄
//        System.out.println(arr[0].length);// Column : 5칸

        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
//                System.out.println("i = " + i + ", j = " + j);
                arr[i][j] = i*j;
            }
//            System.out.println();
        }

        for (int i = 2; i < arr.length ; i++) {
            for (int j = 1; j < arr[0].length ; j++) {
                System.out.printf(" %d * %d = %d\n", i, j, arr[i][j]);
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int x : row) {
                if (x==0)
                    continue;
                System.out.print(x + ", ");
            }
            System.out.println();

        }
    }
}
