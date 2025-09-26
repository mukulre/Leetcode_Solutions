public class LinkedList3{
    public ListNode detectCycle(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                hasCycle=true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        ListNode ptr=head;
        while(ptr!=slow){
            ptr=ptr.next;
            slow=slow.next;
        }
        return ptr;
    }
}