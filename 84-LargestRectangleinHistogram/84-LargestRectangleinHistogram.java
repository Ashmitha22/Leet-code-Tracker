// Last updated: 7/27/2026, 7:06:05 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        int maxArea = 0;
5        int n = heights.length;
6
7        for (int i = 0; i <= n; i++) {
8            int h = (i == n) ? 0 : heights[i];
9
10            while (!stack.isEmpty() && h < heights[stack.peek()]) {
11                int height = heights[stack.pop()];
12                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
13                maxArea = Math.max(maxArea, height * width);
14            }
15
16            stack.push(i);
17        }
18
19        return maxArea;
20    }
21}