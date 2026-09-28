// Last updated: 9/28/2026, 9:54:43 AM
1class Solution {
2    public int rangeBitwiseAnd(int left, int right) {
3
4        int shift = 0;
5
6        while (left != right) {
7            left >>= 1;
8            right >>= 1;
9            shift++;
10        }
11
12        return left << shift;
13    }
14}