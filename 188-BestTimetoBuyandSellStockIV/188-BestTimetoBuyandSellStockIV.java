// Last updated: 9/28/2026, 9:47:58 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3
4        int n = prices.length;
5
6        if (n == 0 || k == 0) {
7            return 0;
8        }
9
10        // If k is large, it becomes unlimited transactions
11        if (k >= n / 2) {
12            int profit = 0;
13
14            for (int i = 1; i < n; i++) {
15                if (prices[i] > prices[i - 1]) {
16                    profit += prices[i] - prices[i - 1];
17                }
18            }
19
20            return profit;
21        }
22
23        int[][] dp = new int[k + 1][n];
24
25        for (int transaction = 1; transaction <= k; transaction++) {
26
27            int maxBuy = -prices[0];
28
29            for (int day = 1; day < n; day++) {
30
31                dp[transaction][day] = Math.max(
32                    dp[transaction][day - 1],
33                    prices[day] + maxBuy
34                );
35
36                maxBuy = Math.max(
37                    maxBuy,
38                    dp[transaction - 1][day] - prices[day]
39                );
40            }
41        }
42
43        return dp[k][n - 1];
44    }
45}