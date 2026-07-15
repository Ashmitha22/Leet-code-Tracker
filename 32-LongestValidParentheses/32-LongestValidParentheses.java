// Last updated: 7/15/2026, 1:43:19 PM
1import java.util.Stack;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5        Stack<Integer> stack = new Stack<>();
6        stack.push(-1);
7
8        int maxLength = 0;
9
10        for (int i = 0; i < s.length(); i++) {
11
12            if (s.charAt(i) == '(') {
13                stack.push(i);
14            } else {
15                stack.pop();
16
17                if (stack.isEmpty()) {
18                    stack.push(i);
19                } else {
20                    maxLength = Math.max(maxLength, i - stack.peek());
21                }
22            }
23        }
24
25        return maxLength;
26    }
27}