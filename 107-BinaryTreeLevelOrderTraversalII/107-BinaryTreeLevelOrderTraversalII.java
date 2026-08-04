// Last updated: 8/4/2026, 9:40:47 AM
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        LinkedList<List<Integer>> result = new LinkedList<>();
19
20        if (root == null)
21            return result;
22
23        Queue<TreeNode> queue = new LinkedList<>();
24        queue.offer(root);
25
26        while (!queue.isEmpty()) {
27            int size = queue.size();
28            List<Integer> level = new ArrayList<>();
29
30            for (int i = 0; i < size; i++) {
31                TreeNode node = queue.poll();
32                level.add(node.val);
33
34                if (node.left != null)
35                    queue.offer(node.left);
36
37                if (node.right != null)
38                    queue.offer(node.right);
39            }
40
41            result.addFirst(level);
42        }
43
44        return result;
45    }
46}