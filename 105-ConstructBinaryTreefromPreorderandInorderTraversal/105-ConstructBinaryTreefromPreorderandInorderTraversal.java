// Last updated: 8/1/2026, 11:31:08 AM
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
17    private Map<Integer, Integer> map = new HashMap<>();
18
19    public TreeNode buildTree(int[] preorder, int[] inorder) {
20        for (int i = 0; i < inorder.length; i++) {
21            map.put(inorder[i], i);
22        }
23        return build(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
24    }
25
26    private TreeNode build(int[] preorder, int preStart, int preEnd,
27                           int inStart, int inEnd) {
28        if (preStart > preEnd || inStart > inEnd)
29            return null;
30
31        TreeNode root = new TreeNode(preorder[preStart]);
32
33        int index = map.get(root.val);
34        int leftSize = index - inStart;
35
36        root.left = build(preorder,
37                          preStart + 1,
38                          preStart + leftSize,
39                          inStart,
40                          index - 1);
41
42        root.right = build(preorder,
43                           preStart + leftSize + 1,
44                           preEnd,
45                           index + 1,
46                           inEnd);
47
48        return root;
49    }
50}