// Last updated: 9/28/2026, 9:54:03 AM
1class Solution {
2
3    public int numIslands(char[][] grid) {
4
5        int count = 0;
6
7        for (int i = 0; i < grid.length; i++) {
8
9            for (int j = 0; j < grid[0].length; j++) {
10
11                if (grid[i][j] == '1') {
12
13                    count++;
14
15                    dfs(grid, i, j);
16                }
17            }
18        }
19
20        return count;
21    }
22
23    private void dfs(char[][] grid, int row, int col) {
24        if (row < 0 || row >= grid.length ||
25            col < 0 || col >= grid[0].length) {
26            return;
27        }
28        if (grid[row][col] == '0') {
29            return;
30        }
31        grid[row][col] = '0';
32        dfs(grid, row - 1, col);
33        dfs(grid, row + 1, col);
34        dfs(grid, row, col - 1);
35        dfs(grid, row, col + 1);
36    }
37}