import java.util.*;

public class CountItems {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> list : items) {
            if (ruleKey.equals("type") && ruleValue.equals(list.get(0))) {
                count++;
            }
            if (ruleKey.equals("color") && ruleValue.equals(list.get(1))) {
                count++;
            }
            if (ruleKey.equals("name") && ruleValue.equals(list.get(2))) {
                count++;
            }
        }
        return count;
    }
}

// ruleKey="type" or "color" or "name"