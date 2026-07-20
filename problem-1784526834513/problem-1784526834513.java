// Last updated: 7/20/2026, 11:23:54 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] res = new int[n][n];
4        int top = 0, bottom = n - 1;
5        int left = 0, right = n - 1;
6        int num = 1;
7
8        while (top <= bottom && left <= right) {
9            for (int i = left; i <= right; i++)
10                res[top][i] = num++;
11            top++;
12
13            for (int i = top; i <= bottom; i++)
14                res[i][right] = num++;
15            right--;
16
17            if (top <= bottom) {
18                for (int i = right; i >= left; i--)
19                    res[bottom][i] = num++;
20                bottom--;
21            }
22
23            if (left <= right) {
24                for (int i = bottom; i >= top; i--)
25                    res[i][left] = num++;
26                left++;
27            }
28        }
29
30        return res;
31    }
32}