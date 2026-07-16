// Last updated: 7/16/2026, 11:22:14 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        // Transpose the matrix
6        for (int i = 0; i < n; i++) {
7            for (int j = i + 1; j < n; j++) {
8                int temp = matrix[i][j];
9                matrix[i][j] = matrix[j][i];
10                matrix[j][i] = temp;
11            }
12        }
13
14        // Reverse each row
15        for (int i = 0; i < n; i++) {
16            int left = 0, right = n - 1;
17            while (left < right) {
18                int temp = matrix[i][left];
19                matrix[i][left] = matrix[i][right];
20                matrix[i][right] = temp;
21                left++;
22                right--;
23            }
24        }
25    }
26}