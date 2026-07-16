// Last updated: 7/16/2026, 4:09:08 PM
1class Solution {
2    public double myPow(double x, int n) {
3        long N = n;   // handle Integer.MIN_VALUE
4        
5        if (N < 0) {
6            x = 1 / x;
7            N = -N;
8        }
9
10        double result = 1.0;
11
12        while (N > 0) {
13            if (N % 2 == 1) {     // if odd
14                result = result * x;
15            }
16
17            x = x * x;            // square the base
18            N = N / 2;
19        }
20
21        return result;
22    }
23}