public class Driver {
    public static void main(String[] args) {
        MatrixDiagonalSum sol = new MatrixDiagonalSum();
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(sol.diagonalSum(mat));
    }
}
