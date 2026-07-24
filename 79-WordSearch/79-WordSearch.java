// Last updated: 7/24/2026, 1:47:10 PM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length, n = board[0].length;
4
5        for (int i = 0; i < m; i++) {
6            for (int j = 0; j < n; j++) {
7                if (dfs(board, word, i, j, 0))
8                    return true;
9            }
10        }
11
12        return false;
13    }
14
15    private boolean dfs(char[][] board, String word, int i, int j, int index) {
16        if (index == word.length())
17            return true;
18
19        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
20                || board[i][j] != word.charAt(index))
21            return false;
22
23        char temp = board[i][j];
24        board[i][j] = '#';
25
26        boolean found = dfs(board, word, i + 1, j, index + 1)
27                || dfs(board, word, i - 1, j, index + 1)
28                || dfs(board, word, i, j + 1, index + 1)
29                || dfs(board, word, i, j - 1, index + 1);
30
31        board[i][j] = temp;
32
33        return found;
34    }
35}