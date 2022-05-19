import java.util.*;

public class LongestSubstringNoRepeating {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, set.size());
        }
        return max;
    }
}
