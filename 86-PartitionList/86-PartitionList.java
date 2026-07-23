// Last updated: 7/23/2026, 9:14:33 AM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode small = new ListNode(0);
14        ListNode large = new ListNode(0);
15
16        ListNode s = small, l = large;
17
18        while (head != null) {
19            if (head.val < x) {
20                s.next = head;
21                s = s.next;
22            } else {
23                l.next = head;
24                l = l.next;
25            }
26            head = head.next;
27        }
28
29        l.next = null;
30        s.next = large.next;
31
32        return small.next;
33    }
34}