package W8S5CM;

import java.util.ArrayList;

public class Matrix {
    public static int minimum(int[][] matrix) {
        int min = 0;
        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i < min) {
                    min = i;
                }
            }
        }

        return min;
    }

    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i % 3 == 0 && !list.contains(i)) {
                    list.add(i);
                }
            }
        }

        return list;
    }
}
