// Last updated: 7/23/2026, 9:29:26 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length, n = matrix[0].length;
4        int left = 0, right = m * n - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8            int value = matrix[mid / n][mid % n];
9
10            if (value == target)
11                return true;
12            else if (value < target)
13                left = mid + 1;
14            else
15                right = mid - 1;
16        }
17
18        return false;
19    }
20}