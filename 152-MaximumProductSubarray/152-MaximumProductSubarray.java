// Last updated: 9/26/2026, 11:50:21 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max = nums[0];
5        int min = nums[0];
6        int answer = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            int num = nums[i];
11
12            if (num < 0) {
13                int temp = max;
14                max = min;
15                min = temp;
16            }
17
18            max = Math.max(num, max * num);
19            min = Math.min(num, min * num);
20
21            answer = Math.max(answer, max);
22        }
23
24        return answer;
25    }
26}