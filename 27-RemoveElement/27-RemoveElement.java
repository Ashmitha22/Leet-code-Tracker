// Last updated: 7/21/2026, 9:37:17 AM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int i=0;
4        for(int j=0;j<nums.length;j++){
5            if(nums[j]!=val){
6                nums[i]=nums[j];
7                i++;
8            }
9        }
10        return i;
11    }
12}
13