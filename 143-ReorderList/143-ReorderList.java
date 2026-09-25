// Last updated: 9/25/2026, 1:48:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13
14        if (head == null || head.next == null) {
15            return;
16        }
17
18        // Step 1: Find the middle
19        ListNode slow = head;
20        ListNode fast = head;
21
22        while (fast != null && fast.next != null) {
23            slow = slow.next;
24            fast = fast.next.next;
25        }
26
27        // Step 2: Reverse the second half
28        ListNode second = slow.next;
29        slow.next = null;
30
31        ListNode prev = null;
32
33        while (second != null) {
34            ListNode next = second.next;
35            second.next = prev;
36            prev = second;
37            second = next;
38        }
39
40        // Step 3: Merge both halves
41        ListNode first = head;
42        second = prev;
43
44        while (second != null) {
45            ListNode temp1 = first.next;
46            ListNode temp2 = second.next;
47
48            first.next = second;
49            second.next = temp1;
50
51            first = temp1;
52            second = temp2;
53        }
54    }
55}