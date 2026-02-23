import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> toRemove = new HashSet<>();

        // First pass: identify unmatched parentheses
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // valid pair
                } else {
                    toRemove.add(i); // unmatched ')'
                }
            }
        }

        // Add any remaining '(' indices in the stack to remove
        while (!stack.isEmpty()) {
            toRemove.add(stack.pop());
        }

        // Build the resulting string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!toRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}