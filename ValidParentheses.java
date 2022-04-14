import java.util.*;

/**
 * if currentChar!=')','}',']' stack.push()
 * else if stack.peek() == map.get(currentChar) stack.pop;
 * else return false;
 */

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
            return false;

        for (char currentChar : s.toCharArray()) {
            if (currentChar != '}' && currentChar != ']' && currentChar != ')') {
                stack.push(currentChar);
            } else if (stack.empty()) {
                return false;
            } else if (map.get(currentChar) == stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.empty())
            return true;
        else
            return false;
    }
}