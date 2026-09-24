// Last updated: 9/24/2026, 9:44:07 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null) {
19            return null;
20        }
21
22        // Step 1: Create copy of each node
23        java.util.HashMap<Node, Node> map = new java.util.HashMap<>();
24
25        Node current = head;
26
27        while (current != null) {
28            map.put(current, new Node(current.val));
29            current = current.next;
30        }
31
32        // Step 2: Connect next and random pointers
33        current = head;
34
35        while (current != null) {
36            Node copy = map.get(current);
37
38            copy.next = map.get(current.next);
39            copy.random = map.get(current.random);
40
41            current = current.next;
42        }
43
44        return map.get(head);
45    }
46}