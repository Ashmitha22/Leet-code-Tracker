// Last updated: 9/25/2026, 1:46:57 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14
15        ListNode slow = head;
16        ListNode fast = head;
17
18        while (fast != null && fast.next != null) {
19
20            slow = slow.next;
21            fast = fast.next.next;
22
23            if (slow == fast) {
24                return true;
25            }
26        }
27
28        return false;
29    }
30}