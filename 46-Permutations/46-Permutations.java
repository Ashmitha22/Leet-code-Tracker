// Last updated: 7/16/2026, 10:24:42 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
5        return result;
6    }
7
8    private void backtrack(int[] nums, List<Integer> current,
9                           boolean[] used, List<List<Integer>> result) {
10
11        if (current.size() == nums.length) {
12            result.add(new ArrayList<>(current));
13            return;
14        }
15
16        for (int i = 0; i < nums.length; i++) {
17            if (used[i]) {
18                continue;
19            }
20
21            used[i] = true;
22            current.add(nums[i]);
23
24            backtrack(nums, current, used, result);
25
26            current.remove(current.size() - 1);
27            used[i] = false;
28        }
29    }
30}