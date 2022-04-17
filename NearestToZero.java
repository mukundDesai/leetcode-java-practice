public class NearestToZero {
    public int findClosestNumber(int[] nums) {
        int closestPositive = 110000;
        int closestNegative = 110000;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num > 0 && num < closestPositive) {
                closestPositive = num;
            }
            if (num < 0 && closestNegative < num) {
                closestNegative = num;
            }
        }
        if (closestPositive < (0 - closestNegative)) {
            return closestPositive;
        } else if (closestPositive > (0 - closestNegative)) {
            return closestNegative;
        } else {
            return closestPositive;
        }
    }
}
