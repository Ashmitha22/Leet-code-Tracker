// Last updated: 7/26/2026, 9:07:06 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s > 9 * n){
4            return -1;
5        }
6        int ans = 0;
7        for(int i=0;i<n;i++){
8            int digit = Math.min(9,s);
9            ans = ans * 10 + digit;
10            s-=digit;
11        }
12        return ans;
13    }
14}