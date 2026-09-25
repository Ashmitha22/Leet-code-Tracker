// Last updated: 9/25/2026, 7:52:20 PM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5
6        StringBuilder result = new StringBuilder();
7
8        for (int i = words.length - 1; i >= 0; i--) {
9            result.append(words[i]);
10
11            if (i != 0) {
12                result.append(" ");
13            }
14        }
15
16        return result.toString();
17    }
18}