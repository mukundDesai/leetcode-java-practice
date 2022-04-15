//brute force -- run 2 loops for column and row and check each element with the target O(n^2)

// run the outer loop from 0 to m-1 and inner loop for a binary search O(nlogn)

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = n - 1;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (target == matrix[i][mid])
                    return true;
                else if (target > matrix[i][mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}
