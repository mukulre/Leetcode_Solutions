import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class LLDet {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next; // Moves one step
            fast = fast.next.next; // Moves two steps
            
            if (slow == fast) return true; // Cycle detected
        }
        
        return false; // No cycle found
    }
public static ListNode createLinkedList(List<Integer> values, int pos) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode cycleNode = null;
for (int i = 0; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
            if (i == pos) cycleNode = current; // Track cycle entry
        }
if (pos != -1) current.next = cycleNode; // Create cycle if pos is valid
return dummy.next;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read node values
        String[] inputArr = scanner.nextLine().split(" ");
        List<Integer> values = Arrays.stream(inputArr).map(Integer::parseInt).toList();
        
        // Read cycle position
        int pos = scanner.nextInt();
        scanner.close();
// Create linked list and check for cycle
        ListNode head = createLinkedList(values, pos);
        System.out.println(hasCycle(head) ? "Yes" : "No");
    }
}

