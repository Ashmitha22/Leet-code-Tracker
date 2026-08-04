// Last updated: 8/4/2026, 9:41:06 AM
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return build(nums, 0, nums.length - 1);
19    }
20
21    private TreeNode build(int[] nums, int left, int right) {
22        if (left > right)
23            return null;
24
25        int mid = left + (right - left) / 2;
26
27        TreeNode root = new TreeNode(nums[mid]);
28        root.left = build(nums, left, mid - 1);
29        root.right = build(nums, mid + 1, right);
30
31        return root;
32    }
33}