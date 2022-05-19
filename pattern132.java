import java.util.*;

public class pattern132 {
    public boolean find132pattern(int[] nums) {
        boolean pattern = false;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length - 1; i++) {
            while (!stack.empty())
                stack.pop();
            stack.push(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                if (stack.size() == 1 && stack.peek() < nums[j]) {
                    stack.push(nums[j]);
                    continue;
                }
                if (stack.peek() > nums[j]) {
                    pattern = true;
                }
            }
        }
        return pattern;
    }
}

// i < j < k
// nums[i] < nums[k] < nums[j]

// for(

// int j = i + 1;j<nums.length-1;j++)
// {
// for (int k = j + 1; k < nums.length; k++) {
// if (nums[i] < nums[k] && nums[k] < nums[j]) {
// return true;
// }
// }
// }