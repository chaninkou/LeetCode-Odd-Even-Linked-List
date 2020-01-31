package oddeven;

public class Main {
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5,6};
		
		ListNode head = insertNode(input);
		
		System.out.println("Input: ");
		displayLinkedList(head);
		
		MakeOddEvenLinkedListFunction solution = new MakeOddEvenLinkedListFunction();
		
		solution.oddEvenList(head);
		
		System.out.println("\nSolution: ");
		
		displayLinkedList(head);
		
		
	}
	
	public static ListNode insertNode(int[] input){
		ListNode dummyRoot = new ListNode(0);
		ListNode previous = dummyRoot;
		
		for(int item : input){
			previous.next = new ListNode(item);
			previous = previous.next;
		}
	
		return dummyRoot.next;
	}
	
	public static void displayLinkedList(ListNode head){
		ListNode current = head;
		
		while(current != null){
			System.out.print(current.val + " ");
			
			current = current.next;
		}
		
		System.out.println(" ");
	}
}
