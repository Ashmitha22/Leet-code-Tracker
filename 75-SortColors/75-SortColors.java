// Last updated: 7/24/2026, 9:50:56 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0, mid = 0, high = nums.length - 1;
4
5        while (mid <= high) {
6            if (nums[mid] == 0) {
7                int temp = nums[low];
8                nums[low] = nums[mid];
9                nums[mid] = temp;
10                low++;
11                mid++;
12            } else if (nums[mid] == 1) {
13                mid++;
14            } else {
15                int temp = nums[mid];
16                nums[mid] = nums[high];
17                nums[high] = temp;
18                high--;
19            }
20        }
21    }
22}