// Last updated: 7/15/2026, 2:27:09 PM
1import java.util.HashSet;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5
6        HashSet<Character>[] rows = new HashSet[9];
7        HashSet<Character>[] cols = new HashSet[9];
8        HashSet<Character>[] boxes = new HashSet[9];
9
10        for (int i = 0; i < 9; i++) {
11            rows[i] = new HashSet<>();
12            cols[i] = new HashSet<>();
13            boxes[i] = new HashSet<>();
14        }
15
16        for (int r = 0; r < 9; r++) {
17            for (int c = 0; c < 9; c++) {
18
19                char num = board[r][c];
20
21                if (num == '.') {
22                    continue;
23                }
24
25                int box = (r / 3) * 3 + (c / 3);
26
27                if (rows[r].contains(num) ||
28                    cols[c].contains(num) ||
29                    boxes[box].contains(num)) {
30                    return false;
31                }
32
33                rows[r].add(num);
34                cols[c].add(num);
35                boxes[box].add(num);
36            }
37        }
38
39        return true;
40    }
41}