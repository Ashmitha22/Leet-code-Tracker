// Last updated: 7/17/2026, 3:12:10 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0, j = 0, star = -1, match = 0;
4
5        while (i < s.length()) {
6            if (j < p.length() &&
7               (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
8                i++;
9                j++;
10            } else if (j < p.length() && p.charAt(j) == '*') {
11                star = j++;
12                match = i;
13            } else if (star != -1) {
14                j = star + 1;
15                i = ++match;
16            } else {
17                return false;
18            }
19        }
20
21        while (j < p.length() && p.charAt(j) == '*') {
22            j++;
23        }
24
25        return j == p.length();
26    }
27}