// Last updated: 8/6/2026, 9:06:44 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n = triangle.size();
4        int[] dp = new int[n + 1];
5
6        for (int i = n - 1; i >= 0; i--) {
7            for (int j = 0; j <= i; j++) {
8                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
9            }
10        }
11
12        return dp[0];
13    }
14}