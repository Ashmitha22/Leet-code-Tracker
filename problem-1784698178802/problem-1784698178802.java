// Last updated: 7/22/2026, 10:59:38 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4        boolean firstRow = false, firstCol = false;
5
6        for (int i = 0; i < m; i++)
7            if (matrix[i][0] == 0)
8                firstCol = true;
9
10        for (int j = 0; j < n; j++)
11            if (matrix[0][j] == 0)
12                firstRow = true;
13
14        for (int i = 1; i < m; i++) {
15            for (int j = 1; j < n; j++) {
16                if (matrix[i][j] == 0) {
17                    matrix[i][0] = 0;
18                    matrix[0][j] = 0;
19                }
20            }
21        }
22
23        for (int i = 1; i < m; i++) {
24            for (int j = 1; j < n; j++) {
25                if (matrix[i][0] == 0 || matrix[0][j] == 0)
26                    matrix[i][j] = 0;
27            }
28        }
29
30        if (firstRow)
31            for (int j = 0; j < n; j++)
32                matrix[0][j] = 0;
33
34        if (firstCol)
35            for (int i = 0; i < m; i++)
36                matrix[i][0] = 0;
37    }
38}