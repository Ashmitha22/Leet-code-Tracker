// Last updated: 9/22/2026, 8:33:46 PM
1class Solution {
2    public void solve(char[][] board) {
3
4        int rows = board.length;
5        int cols = board[0].length;
6
7        // Check first and last column
8        for (int i = 0; i < rows; i++) {
9            if (board[i][0] == 'O') {
10                dfs(board, i, 0);
11            }
12
13            if (board[i][cols - 1] == 'O') {
14                dfs(board, i, cols - 1);
15            }
16        }
17
18        // Check first and last row
19        for (int j = 0; j < cols; j++) {
20            if (board[0][j] == 'O') {
21                dfs(board, 0, j);
22            }
23
24            if (board[rows - 1][j] == 'O') {
25                dfs(board, rows - 1, j);
26            }
27        }
28
29        // Convert surrounded O's to X
30        // Convert safe '#' back to O
31        for (int i = 0; i < rows; i++) {
32            for (int j = 0; j < cols; j++) {
33
34                if (board[i][j] == 'O') {
35                    board[i][j] = 'X';
36                }
37
38                if (board[i][j] == '#') {
39                    board[i][j] = 'O';
40                }
41            }
42        }
43    }
44
45    public void dfs(char[][] board, int row, int col) {
46
47        // Out of bounds
48        if (row < 0 || row >= board.length ||
49            col < 0 || col >= board[0].length) {
50            return;
51        }
52
53        // Not an O
54        if (board[row][col] != 'O') {
55            return;
56        }
57
58        // Mark as safe
59        board[row][col] = '#';
60
61        // Move up
62        dfs(board, row - 1, col);
63
64        // Move down
65        dfs(board, row + 1, col);
66
67        // Move left
68        dfs(board, row, col - 1);
69
70        // Move right
71        dfs(board, row, col + 1);
72    }
73}