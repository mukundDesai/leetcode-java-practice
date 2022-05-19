public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        for(int i = 1; i < nums.length; i++){
            int temp = nums[n];
            if(temp != nums[i]){
                nums[n+1]=nums[i];
                n++;
            }
        }
        return n+1;
    }
}
