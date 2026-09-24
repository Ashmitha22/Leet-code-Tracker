// Last updated: 9/24/2026, 9:52:54 PM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3
4        boolean[] dp = new boolean[s.length() + 1];
5
6        dp[0] = true;
7
8        for (int i = 1; i <= s.length(); i++) {
9
10            for (String word : wordDict) {
11
12                int len = word.length();
13
14                if (i >= len && dp[i - len]
15                        && s.substring(i - len, i).equals(word)) {
16                    dp[i] = true;
17                    break;
18                }
19            }
20        }
21
22        return dp[s.length()];
23    }
24}