// Last updated: 7/23/2026, 10:21:11 AM
1class Solution {
2    public String countAndSay(int n) {
3        String result = "1";
4
5        for (int i = 2; i <= n; i++) {
6            StringBuilder next = new StringBuilder();
7
8            int count = 1;
9
10            for (int j = 1; j <= result.length(); j++) {
11
12                if (j < result.length() &&
13                    result.charAt(j) == result.charAt(j - 1)) {
14                    count++;
15                } else {
16                    next.append(count);
17                    next.append(result.charAt(j - 1));
18                    count = 1;
19                }
20            }
21
22            result = next.toString();
23        }
24
25        return result;
26    }
27}