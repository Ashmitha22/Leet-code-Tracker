// Last updated: 7/20/2026, 10:59:30 AM
1class Solution {
2    List<List<String>> ans = new ArrayList<>();
3
4    public List<List<String>> solveNQueens(int n) {
5        char[][] board = new char[n][n];
6        for (char[] row : board)
7            Arrays.fill(row, '.');
8
9        backtrack(board, 0);
10        return ans;
11    }
12
13    private void backtrack(char[][] board, int row) {
14        if (row == board.length) {
15            List<String> temp = new ArrayList<>();
16            for (char[] r : board)
17                temp.add(new String(r));
18            ans.add(temp);
19            return;
20        }
21
22        for (int col = 0; col < board.length; col++) {
23            if (isSafe(board, row, col)) {
24                board[row][col] = 'Q';
25                backtrack(board, row + 1);
26                board[row][col] = '.';
27            }
28        }
29    }
30
31    private boolean isSafe(char[][] board, int row, int col) {
32        for (int i = 0; i < row; i++)
33            if (board[i][col] == 'Q')
34                return false;
35
36        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
37            if (board[i][j] == 'Q')
38                return false;
39
40        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
41            if (board[i][j] == 'Q')
42                return false;
43
44        return true;
45    }
46}