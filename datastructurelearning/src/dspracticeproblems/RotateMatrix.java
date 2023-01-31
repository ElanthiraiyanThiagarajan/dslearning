package  dspracticeproblems;
import java.util.Arrays;

public class RotateMatrix {

    static boolean rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int n2 = matrix[0].length;
        if (n == 0 || n != n2)
            return false;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;

            }

        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}
