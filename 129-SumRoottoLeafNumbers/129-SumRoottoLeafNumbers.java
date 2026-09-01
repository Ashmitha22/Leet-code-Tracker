// Last updated: 9/1/2026, 9:16:26 PM
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
17    public int sumNumbers(TreeNode root) {
18        return dfs(root, 0);
19    }
20
21    int dfs(TreeNode root, int sum) {
22        if (root == null)
23            return 0;
24
25        sum = sum * 10 + root.val;
26
27        if (root.left == null && root.right == null)
28            return sum;
29
30        return dfs(root.left, sum) + dfs(root.right, sum);
31    }
32}