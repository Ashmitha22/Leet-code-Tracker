// Last updated: 7/21/2026, 9:48:58 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if (n <= 0) return false;
4
5        while (n % 2 == 0) {  
6            n = n / 2;
7        }
8
9        return n == 1;
10    }
11}
12