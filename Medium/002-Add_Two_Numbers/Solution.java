// Solution inspired by [niits/https://leetcode.com/problems/add-two-numbers/solutions/5184763/video-simple-addition-algorithm-python-javascript-java-and-c/]

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to simplify handling of the resulting linked list
        ListNode result = new ListNode();
        ListNode temp = result; // Pointer to track the current node

        // sum and carry variables for addition
        int sum = 0, carry = 0;

        // Iterate until both lists are exhausted and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            sum = carry; // Start with the carry from the previous step

            if (l1 != null) {
                sum += l1.val; // Add the value of l1 if available
                l1 = l1.next; // Move to the next node in l1
            }

            if (l2 != null) {
                sum += l2.val; // Add the value of l2 if available
                l2 = l2.next; // Move to the next node in l2
            }

            // Create a new node with the last digit of sum
            temp.next = new ListNode(sum % 10);
            temp = temp.next; // Move to the next node
            carry = sum / 10; // Compute carry for the next step
        }

        // Skip the dummy head and return the actual result
        return result.next;
    }
}