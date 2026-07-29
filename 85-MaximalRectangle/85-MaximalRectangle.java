// Last updated: 7/29/2026, 7:02:06 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0)
4            return 0;
5
6        int m = matrix.length;
7        int n = matrix[0].length;
8        int[] heights = new int[n];
9        int maxArea = 0;
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                if (matrix[i][j] == '1')
14                    heights[j]++;
15                else
16                    heights[j] = 0;
17            }
18
19            maxArea = Math.max(maxArea, largestRectangleArea(heights));
20        }
21
22        return maxArea;
23    }
24
25    private int largestRectangleArea(int[] heights) {
26        Stack<Integer> stack = new Stack<>();
27        int maxArea = 0;
28
29        for (int i = 0; i <= heights.length; i++) {
30            int h = (i == heights.length) ? 0 : heights[i];
31
32            while (!stack.isEmpty() && h < heights[stack.peek()]) {
33                int height = heights[stack.pop()];
34                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
35                maxArea = Math.max(maxArea, height * width);
36            }
37
38            stack.push(i);
39        }
40
41        return maxArea;
42    }
43}