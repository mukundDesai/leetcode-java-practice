//brute force -- run 2 loops for column and row and check each element with the target O(n^2)

// run the outer loop from 0 to m-1 and inner loop for a binary search O(nlogn)

//

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int column = matrix[0].length - 1;
        int row = 0;
        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column])
                return true;
            else if (target > matrix[row][column])
                row++;
            else
                column--;
        }
        return false;
    }
}
