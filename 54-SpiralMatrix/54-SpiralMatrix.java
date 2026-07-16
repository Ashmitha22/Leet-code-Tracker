// Last updated: 7/16/2026, 9:30:39 PM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> result = new ArrayList<>();
4
5        int top = 0;
6        int bottom = matrix.length - 1;
7        int left = 0;
8        int right = matrix[0].length - 1;
9
10        while (top <= bottom && left <= right) {
11
12            // Left → Right
13            for (int i = left; i <= right; i++) {
14                result.add(matrix[top][i]);
15            }
16            top++;
17
18            // Top → Bottom
19            for (int i = top; i <= bottom; i++) {
20                result.add(matrix[i][right]);
21            }
22            right--;
23
24            // Right → Left
25            if (top <= bottom) {
26                for (int i = right; i >= left; i--) {
27                    result.add(matrix[bottom][i]);
28                }
29                bottom--;
30            }
31
32            // Bottom → Top
33            if (left <= right) {
34                for (int i = bottom; i >= top; i--) {
35                    result.add(matrix[i][left]);
36                }
37                left++;
38            }
39        }
40
41        return result;
42    }
43}