// Last updated: 9/25/2026, 5:52:17 PM
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
12    public ListNode insertionSortList(ListNode head) {
13
14        ListNode dummy = new ListNode(0);
15        ListNode current = head;
16
17        while (current != null) {
18
19            ListNode next = current.next;
20
21            // Find the correct position
22            ListNode prev = dummy;
23
24            while (prev.next != null &&
25                   prev.next.val < current.val) {
26                prev = prev.next;
27            }
28
29            // Insert current node
30            current.next = prev.next;
31            prev.next = current;
32
33            current = next;
34        }
35
36        return dummy.next;
37    }
38}