// Last updated: 9/26/2026, 11:51:04 AM
1class Solution {
2    public int findMin(int[] nums) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] > nums[right]) {
12                left = mid + 1;
13            } else {
14                right = mid;
15            }
16        }
17
18        return nums[left];
19    }
20}