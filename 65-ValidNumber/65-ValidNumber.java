// Last updated: 7/24/2026, 9:51:58 AM
1class Solution {
2    public boolean isNumber(String s) {
3        s = s.trim();
4
5        boolean seenDigit = false;
6        boolean seenDot = false;
7        boolean seenE = false;
8        boolean digitAfterE = true;
9
10        for (int i = 0; i < s.length(); i++) {
11            char ch = s.charAt(i);
12
13            if (Character.isDigit(ch)) {
14                seenDigit = true;
15                digitAfterE = true;
16            } 
17            else if (ch == '+' || ch == '-') {
18                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
19                    return false;
20            } 
21            else if (ch == '.') {
22                if (seenDot || seenE)
23                    return false;
24                seenDot = true;
25            } 
26            else if (ch == 'e' || ch == 'E') {
27                if (seenE || !seenDigit)
28                    return false;
29                seenE = true;
30                digitAfterE = false;
31            } 
32            else {
33                return false;
34            }
35        }
36
37        return seenDigit && digitAfterE;
38    }
39}