package oddeven;

public class MakeOddEvenLinkedListFunction {
	public ListNode oddEvenList(ListNode head) {
        if(head == null){
           return head; 
        }
        
        // Odd pointer will start from head
        ListNode odd = head;
        
        // Even pointer will start from the head.next cause even
        ListNode even = head.next;
        
        // This pointer keep track of where even linked list is at
        ListNode startEvenHead = even;
        
        // Use the even pointer to go through the whole linked list
        while(even != null && even.next != null){
        	// Cool pattern to do
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        
        // Connect the odd to the even now
        odd.next = startEvenHead;
        
        return head;
    }
}
