// Last updated: 7/28/2026, 9:56:56 PM
1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4        if (s.charAt(0) == '0')
5            return 0;
6
7        int[] dp = new int[n + 1];
8        dp[0] = 1;
9        dp[1] = 1;
10
11        for (int i = 2; i <= n; i++) {
12            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
13            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
14
15            if (oneDigit >= 1)
16                dp[i] += dp[i - 1];
17
18            if (twoDigits >= 10 && twoDigits <= 26)
19                dp[i] += dp[i - 2];
20        }
21
22        return dp[n];
23    }
24}