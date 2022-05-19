public class NextPermutatiion {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                pivot = i - 1;
                break;
            }
        }

        if (pivot == -1) {
            for (int i = 0; i < n / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[n - i - 1];
                nums[n - i - 1] = temp;
            }
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        for (int i = 1; pivot + i < n - i; i++) {
            int temp = nums[pivot + i];
            nums[pivot + i] = nums[n - i];
            nums[n - i] = temp;
        }
    }
}

/**
 * [0, 1, 2, 5, 3, 3, 0 ]
 * find the pivot (element left of the decreasing subarr)
 * if pivot is -1 then reverse the whole arr
 * find the right most element in the subarr greater than pivot
 * swap the pivot and the above element
 * reverse the new subarr
 */