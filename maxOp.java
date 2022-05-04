import java.util.*;

public class maxOp {
    public int maxOperations(int[] nums, int k) {
        List<Integer> array = new ArrayList<>();
        for (int i : nums) {
            array.add(i);
        }
        array.sort(Comparator.naturalOrder());
        int first = 0, last = array.size() - 1, operations = 0;
        while (first < last) {
            if (array.get(first) + array.get(last) == k) {
                array.remove(first);
                array.remove(last - 1);
                operations += 1;
                first = 0;
                last = array.size() - 1;
            } else if (array.get(first) + array.get(last) > k) {
                last--;
            } else {
                first++;
            }
        }
        return operations;
    }
}
