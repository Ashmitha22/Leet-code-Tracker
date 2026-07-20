// Last updated: 7/20/2026, 11:43:13 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0)
14            return head;
15
16        ListNode curr = head;
17        int len = 1;
18
19        while (curr.next != null) {
20            curr = curr.next;
21            len++;
22        }
23
24        curr.next = head;
25        k %= len;
26
27        for (int i = 0; i < len - k; i++)
28            curr = curr.next;
29
30        head = curr.next;
31        curr.next = null;
32
33        return head;
34    }
35}