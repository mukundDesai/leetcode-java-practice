import java.util.Stack;

public class removeDuplicates {
    public String removeDup(String s, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
            }

        }
        return "";
    }
}
