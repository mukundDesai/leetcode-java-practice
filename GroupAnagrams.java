import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> temp1 = new ArrayList<>();
        // List<String> temp2 = new ArrayList<>();
        isAnagram isAnagram = new isAnagram();
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (isAnagram.check(strs[i], strs[j])) {
                    temp1.add(strs[i]);
                } else {
                    List<String> temp = new ArrayList<>();
                    temp.add(strs[i]);
                    list.add(temp);
                    temp.remove(strs[i]);
                    temp.add(strs[j]);
                    list.add(temp);
                }
            }
        }
        return list;
    }
}

class isAnagram {
    public boolean check(String s1, String s2) {
        int[] array = new int[26];
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i) - 'a';
            array[index]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i) - 'a';
            array[index]--;
        }
        for (int i : array) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
