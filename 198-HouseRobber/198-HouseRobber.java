// Last updated: 9/28/2026, 9:51:19 AM
1class Solution {
2    public int rob(int[] nums) {
3
4        int prev2 = 0;
5        int prev1 = 0;
6
7        for (int money : nums) {
8
9            int current = Math.max(
10                prev1,
11                prev2 + money
12            );
13
14            prev2 = prev1;
15            prev1 = current;
16        }
17
18        return prev1;
19    }
20}