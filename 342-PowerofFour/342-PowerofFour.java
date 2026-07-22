// Last updated: 7/22/2026, 11:42:05 AM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n<=0) return false;
4        while(n%4==0){
5            n=n/4;
6        }
7        return n==1;
8        
9    }
10}