// Last updated: 7/16/2026, 11:16:11 AM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
6        return result;
7    }
8
9    private void backtrack(int[] nums, boolean[] used,
10                           List<Integer> current, List<List<Integer>> result) {
11
12        if (current.size() == nums.length) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        for (int i = 0; i < nums.length; i++) {
18
19            if (used[i]) {
20                continue;
21            }
22
23            // Skip duplicate numbers
24            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
25                continue;
26            }
27
28            used[i] = true;
29            current.add(nums[i]);
30
31            backtrack(nums, used, current, result);
32
33            current.remove(current.size() - 1);
34            used[i] = false;
35        }
36    }
37}