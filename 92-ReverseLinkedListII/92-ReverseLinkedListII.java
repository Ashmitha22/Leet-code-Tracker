// Last updated: 7/28/2026, 10:02:15 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if (head == null || left == right)
14            return head;
15
16        ListNode dummy = new ListNode(0);
17        dummy.next = head;
18        ListNode prev = dummy;
19
20        for (int i = 1; i < left; i++)
21            prev = prev.next;
22
23        ListNode curr = prev.next;
24
25        for (int i = 0; i < right - left; i++) {
26            ListNode next = curr.next;
27            curr.next = next.next;
28            next.next = prev.next;
29            prev.next = next;
30        }
31
32        return dummy.next;
33    }
34}