// Last updated: 7/23/2026, 10:55:14 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(candidates, target, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int[] candidates, int target, int start,
11                           List<Integer> current,
12                           List<List<Integer>> result) {
13
14        if (target == 0) {
15            result.add(new ArrayList<>(current));
16            return;
17        }
18
19        if (target < 0) {
20            return;
21        }
22
23        for (int i = start; i < candidates.length; i++) {
24            current.add(candidates[i]);
25            backtrack(candidates, target - candidates[i], i, current, result);
26            current.remove(current.size() - 1);
27        }
28    }
29}