// Last updated: 8/4/2026, 9:05:38 AM
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
17    public TreeNode buildTree(int[] inorder, int[] postorder) {
18        Map<Integer, Integer> map = new HashMap<>();
19
20        for (int i = 0; i < inorder.length; i++) {
21            map.put(inorder[i], i);
22        }
23
24        return build(inorder, 0, inorder.length - 1,
25                     postorder, 0, postorder.length - 1, map);
26    }
27
28    private TreeNode build(int[] inorder, int inStart, int inEnd,
29                           int[] postorder, int postStart, int postEnd,
30                           Map<Integer, Integer> map) {
31
32        if (inStart > inEnd || postStart > postEnd)
33            return null;
34
35        TreeNode root = new TreeNode(postorder[postEnd]);
36
37        int index = map.get(root.val);
38        int leftSize = index - inStart;
39
40        root.left = build(inorder, inStart, index - 1,
41                          postorder, postStart, postStart + leftSize - 1, map);
42
43        root.right = build(inorder, index + 1, inEnd,
44                           postorder, postStart + leftSize, postEnd - 1, map);
45
46        return root;
47    }
48}