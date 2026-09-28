// Last updated: 9/28/2026, 9:48:55 AM
1class Solution {
2    public int reverseBits(int n) {
3
4        int result = 0;
5
6        for (int i = 0; i < 32; i++) {
7
8            // Take the last bit of n
9            int bit = n & 1;
10
11            // Shift result left and add that bit
12            result = (result << 1) | bit;
13
14            // Remove the last bit from n
15            n = n >>> 1;
16        }
17
18        return result;
19    }
20}