// Last updated: 7/21/2026, 9:24:08 AM
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> stack = new Stack<>();
4
5        for (String s : path.split("/")) {
6            if (s.equals("") || s.equals("."))
7                continue;
8            if (s.equals("..")) {
9                if (!stack.isEmpty())
10                    stack.pop();
11            } else {
12                stack.push(s);
13            }
14        }
15
16        return "/" + String.join("/", stack);
17    }
18}