// Last updated: 7/28/2026, 9:40:02 PM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(nums, 0, new ArrayList<>(), ans);
6        return ans;
7    }
8
9    private void backtrack(int[] nums, int start, List<Integer> temp, List<List<Integer>> ans) {
10        ans.add(new ArrayList<>(temp));
11
12        for (int i = start; i < nums.length; i++) {
13            if (i > start && nums[i] == nums[i - 1])
14                continue;
15
16            temp.add(nums[i]);
17            backtrack(nums, i + 1, temp, ans);
18            temp.remove(temp.size() - 1);
19        }
20    }
21}