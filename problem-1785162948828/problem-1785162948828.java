// Last updated: 7/27/2026, 8:05:48 PM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        List<Integer> result = new ArrayList<>();
4
5        int size = 1 << n;
6
7        for (int i = 0; i < size; i++) {
8            result.add(i ^ (i >> 1));
9        }
10
11        return result;
12    }
13}