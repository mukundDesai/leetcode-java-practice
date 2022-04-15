
public class Driver {
    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();
        int[] nums = { 5, 6, 7, 123, 4342, 623 };
        int target = 6;
        System.out.println(sol.search(nums, target));
    }
}
