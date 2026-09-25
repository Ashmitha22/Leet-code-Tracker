// Last updated: 9/25/2026, 5:54:05 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 /** */
11class Solution {
12    public ListNode sortList(ListNode head) {
13
14        if (head == null || head.next == null) {
15            return head;
16        }
17        ListNode slow = head;
18        ListNode fast = head.next;
19
20        while (fast != null && fast.next != null) {
21            slow = slow.next;
22            fast = fast.next.next;
23        }
24
25
26        ListNode second = slow.next;
27        slow.next = null;
28
29        
30        ListNode left = sortList(head);
31        ListNode right = sortList(second);
32
33
34        return merge(left, right);
35    }
36
37    private ListNode merge(ListNode left, ListNode right) {
38
39        ListNode dummy = new ListNode(0);
40        ListNode current = dummy;
41
42        while (left != null && right != null) {
43
44            if (left.val <= right.val) {
45                current.next = left;
46                left = left.next;
47            } else {
48                current.next = right;
49                right = right.next;
50            }
51
52            current = current.next;
53        }
54
55        if (left != null) {
56            current.next = left;
57        }
58
59        if (right != null) {
60            current.next = right;
61        }
62
63        return dummy.next;
64    }
65}