
/**
 * target is 6
 * nums={1,2,3,4,5,6,8,9,10,11,12,13,14,15}
 * indices :
 * Low = 0
 * High = length(num)-1
 * Mid = (Hogh+Low)/2
 * while(low<high){
 * if target == nums[mid]
 * return mid;
 * else if target < nums[mid]
 * high = mid
 * mid = (high + low)/2
 * else
 * low = mid
 * mid = (high+low)/2
 * }
 */

class BinarySearch {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
