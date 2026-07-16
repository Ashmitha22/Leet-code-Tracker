// Last updated: 7/16/2026, 10:14:23 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(candidates);
8
9        backtrack(candidates, target, 0, new ArrayList<>(), result);
10
11        return result;
12    }
13
14    private void backtrack(int[] candidates, int target, int start,
15                           List<Integer> current,
16                           List<List<Integer>> result) {
17
18        if (target == 0) {
19            result.add(new ArrayList<>(current));
20            return;
21        }
22
23        for (int i = start; i < candidates.length; i++) {
24
25            // Skip duplicates
26            if (i > start && candidates[i] == candidates[i - 1]) {
27                continue;
28            }
29
30            // No need to continue if current number exceeds target
31            if (candidates[i] > target) {
32                break;
33            }
34
35            current.add(candidates[i]);
36
37            backtrack(candidates, target - candidates[i], i + 1, current, result);
38
39            current.remove(current.size() - 1);
40        }
41    }
42}