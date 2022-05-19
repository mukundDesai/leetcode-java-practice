public class FirstLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = { left, right };
        if (nums.length == 0) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }

        while (nums[left] != target && left < right) {
            left++;
        }

        while (nums[right] != target && right > left) {
            right--;
        }
        res[0] = left;
        res[1] = right;
        if (left >= right && nums[right] != target) {
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
}
