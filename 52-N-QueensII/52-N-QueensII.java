// Last updated: 7/22/2026, 10:33:21 AM
1class Solution {
2    List<List<String>> ans = new ArrayList<>();
3
4    public int totalNQueens(int n) {
5        char[][] board = new char[n][n];
6        for (char[] row : board)
7            Arrays.fill(row, '.');
8
9        backtrack(board, 0);
10        return ans.size();
11    }
12
13    private void backtrack(char[][] board, int row) {
14        if (row == board.length) {
15            ans.add(new ArrayList<>());
16            return;
17        }
18
19        for (int col = 0; col < board.length; col++) {
20            if (isSafe(board, row, col)) {
21                board[row][col] = 'Q';
22                backtrack(board, row + 1);
23                board[row][col] = '.';
24            }
25        }
26    }
27
28    private boolean isSafe(char[][] board, int row, int col) {
29        for (int i = 0; i < row; i++)
30            if (board[i][col] == 'Q')
31                return false;
32
33        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
34            if (board[i][j] == 'Q')
35                return false;
36
37        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
38            if (board[i][j] == 'Q')
39                return false;
40
41        return true;
42    }
43}