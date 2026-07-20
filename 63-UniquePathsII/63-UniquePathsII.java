// Last updated: 7/20/2026, 12:25:17 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length, n = obstacleGrid[0].length;
4        int[][] dp = new int[m][n];
5
6        if (obstacleGrid[0][0] == 1) return 0;
7        dp[0][0] = 1;
8
9        for (int i = 1; i < m; i++)
10            dp[i][0] = obstacleGrid[i][0] == 0 ? dp[i - 1][0] : 0;
11
12        for (int j = 1; j < n; j++)
13            dp[0][j] = obstacleGrid[0][j] == 0 ? dp[0][j - 1] : 0;
14
15        for (int i = 1; i < m; i++) {
16            for (int j = 1; j < n; j++) {
17                if (obstacleGrid[i][j] == 0)
18                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
19            }
20        }
21
22        return dp[m - 1][n - 1];
23    }
24}