// Last updated: 7/22/2026, 12:25:43 PM
1class Solution {
2    public int tribonacci(int n) {
3        if (n == 0) return 0;
4        if (n == 1 || n == 2) return 1;
5
6        int a = 0, b = 1, c = 1;
7
8        for (int i = 3; i <= n; i++) {
9            int d = a + b + c;
10            a = b;
11            b = c;
12            c = d;
13        }
14
15        return c;
16    }
17}
18
19