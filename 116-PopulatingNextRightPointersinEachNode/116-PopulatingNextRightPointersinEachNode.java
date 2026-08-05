// Last updated: 8/5/2026, 8:24:09 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if (root == null)
27            return null;
28
29        Queue<Node> queue = new LinkedList<>();
30        queue.offer(root);
31
32        while (!queue.isEmpty()) {
33            int size = queue.size();
34            Node prev = null;
35
36            for (int i = 0; i < size; i++) {
37                Node curr = queue.poll();
38
39                if (prev != null)
40                    prev.next = curr;
41
42                prev = curr;
43
44                if (curr.left != null)
45                    queue.offer(curr.left);
46
47                if (curr.right != null)
48                    queue.offer(curr.right);
49            }
50
51            prev.next = null;
52        }
53
54        return root;
55    }
56}