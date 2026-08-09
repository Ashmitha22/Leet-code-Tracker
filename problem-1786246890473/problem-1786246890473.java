// Last updated: 8/9/2026, 9:11:30 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int n=prices.length;
6        int m=discounts.length;
7        int p=Math.min(n,m);
8        double tot=0.0;
9        for(int i=0;i<p;i++){
10            int price=prices[n-i-1];
11            int dis=discounts[m-i-1];
12            tot+=(price*(100.0-dis))/100.0;
13        }
14        for(int i=0;i<n-p;i++){
15            tot+=prices[i];
16        }return tot;
17    }
18}