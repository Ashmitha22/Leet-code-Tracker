// Last updated: 8/5/2026, 7:41:47 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> result = new ArrayList<>();
19        dfs(root, targetSum, new ArrayList<>(), result);
20        return result;
21    }
22
23    private void dfs(TreeNode node, int targetSum,
24                     List<Integer> path, List<List<Integer>> result) {
25
26        if (node == null)
27            return;
28
29        path.add(node.val);
30
31        if (node.left == null && node.right == null && targetSum == node.val) {
32            result.add(new ArrayList<>(path));
33        } else {
34            dfs(node.left, targetSum - node.val, path, result);
35            dfs(node.right, targetSum - node.val, path, result);
36        }
37
38        path.remove(path.size() - 1);
39    }
40}