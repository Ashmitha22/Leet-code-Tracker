// Last updated: 7/27/2026, 7:17:10 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2)
4            return nums.length;
5
6        int k = 2;
7
8        for (int i = 2; i < nums.length; i++) {
9            if (nums[i] != nums[k - 2]) {
10                nums[k] = nums[i];
11                k++;
12            }
13        }
14
15        return k;
16    }
17}