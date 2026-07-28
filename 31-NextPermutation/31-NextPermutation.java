// Last updated: 7/28/2026, 10:11:41 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4
5        // Step 1: Find the pivot
6        int i = n - 2;
7        while (i >= 0 && nums[i] >= nums[i + 1]) {
8            i--;
9        }
10
11        // Step 2: Find the next greater element
12        if (i >= 0) {
13            int j = n - 1;
14            while (nums[j] <= nums[i]) {
15                j--;
16            }
17            swap(nums, i, j);
18        }
19
20        // Step 3: Reverse the suffix
21        reverse(nums, i + 1, n - 1);
22    }
23
24    private void swap(int[] nums, int i, int j) {
25        int temp = nums[i];
26        nums[i] = nums[j];
27        nums[j] = temp;
28    }
29
30    private void reverse(int[] nums, int left, int right) {
31        while (left < right) {
32            swap(nums, left, right);
33            left++;
34            right--;
35        }
36    }
37}