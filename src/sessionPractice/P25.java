package sessionPractice;

import java.util.Arrays;

public class P25 {
    public static void main(String[] args) {

        int[][] matris = {
                {2,4,5,1},
                {1,3,7,2},
                {8,1,5,2}
        };

        int[] satirToplami = new int[matris.length];
        int[] sutunToplami = new int[matris[2].length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                satirToplami[i] += matris[i][j];
                sutunToplami[j] += matris[i][j];
            }
        }
        System.out.println(Arrays.toString(satirToplami) + "---" +Arrays.toString(sutunToplami));

    }
}
