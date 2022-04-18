public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int m = mat.length - 1;
        int sum = 0;
        for (int i = 0; i <= m; i++) {
            if ((m - i) != i) {
                sum = sum + mat[i][m - i] + mat[i][i];
            } else {
                sum = sum + mat[i][i];
            }
        }
        return sum;
    }
}
