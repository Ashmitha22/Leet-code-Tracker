// Last updated: 7/27/2026, 7:34:45 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode prev = dummy;
16
17        while (head != null) {
18            if (head.next != null && head.val == head.next.val) {
19                while (head.next != null && head.val == head.next.val) {
20                    head = head.next;
21                }
22                prev.next = head.next;
23            } else {
24                prev = prev.next;
25            }
26            head = head.next;
27        }
28
29        return dummy.next;
30    }
31}