// Last updated: 8/5/2026, 8:33:40 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        row.add(1);
5
6        for (int i = 1; i <= rowIndex; i++) {
7            for (int j = i - 1; j >= 1; j--) {
8                row.set(j, row.get(j) + row.get(j - 1));
9            }
10            row.add(1);
11        }
12
13        return row;
14    }
15}