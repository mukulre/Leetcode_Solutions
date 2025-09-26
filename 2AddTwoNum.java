class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode size1 = l1;
        ListNode size2 = l2;
        int size_1 = 0;
        int size_2 = 0;
        while(size1 != null){
            size_1++;
            size1 = size1.next;
        }
        while(size2 != null){
            size_2++;
            size2 = size2.next;
        }
        
        // Declare pointers outside so they are accessible later.
        ListNode curr1, curr2, result;
        if(size_1 >= size_2){
            curr1 = l1;
            curr2 = l2;
            result = l1;
        } else {
            curr1 = l2;
            curr2 = l1;
            result = l2;
        }
        
        while(curr1 != null && curr2 != null){
            if((curr1.val + curr2.val) >= 10){
                curr1.val = (curr1.val + curr2.val) % 10;
                if (curr1.next == null) {
                    curr1.next = new ListNode(0);
                }
                curr1.next.val = curr1.next.val + 1;
            } else {
                curr1.val = curr1.val + curr2.val;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1 != null && curr1.val >= 10 && curr1.next != null){
            curr1.val = 0;
            curr1.next.val += 1;
            curr1 = curr1.next;
        }
        if(curr1 != null && curr1.val >= 10){ 
            curr1.val = 0;
            curr1.next = new ListNode(1);
        }
        return result;
    }
}