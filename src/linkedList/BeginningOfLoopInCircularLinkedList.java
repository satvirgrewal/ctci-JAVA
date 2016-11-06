package linkedList;

import java.util.HashSet;
import java.util.Set;

public class BeginningOfLoopInCircularLinkedList {
	
	
	static class LinkedListNode{
		 int key;
		 LinkedListNode next;
		
		LinkedListNode(int input){
			key = input;
			next = null;
		}
	}
	
	public static void main(String[] args){
		//LinkedListOwn<LinkedListNode> list = new LinkedListOwn<>();
		LinkedListNode a= new LinkedListNode(1);
		LinkedListNode b= new LinkedListNode(2);
		LinkedListNode c= new LinkedListNode(3);
		LinkedListNode d= new LinkedListNode(4);
		LinkedListNode e= new LinkedListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;
		
		//LinkedListNode beginning = findBeginning(a);
		LinkedListNode beginning = findBeginningOwn (a);
		
		System.out.println(beginning.key);
		
		
	}
	
	public static LinkedListNode findBeginning(LinkedListNode head) {
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		
		while(n2.next != null){
			n1 = n1.next;
			n2 = n2.next.next;
			if (n1 == n2){
				break;
			}
		}
		
		n1 = head;
		while(n1 != n2){
			n1 = n1.next;
			n2 = n2.next;
		}
		return n2;
	}
	private static LinkedListNode findBeginningOwn(LinkedListNode head){
		LinkedListNode output = null;
		Set<LinkedListNode> set = new HashSet<>();
		while(head!= null){
			if (set.contains(head)) 
			{
				output = head;
				break;
			}
			
			set.add(head);
			head= head.next;
			
		}
		return output;
	}

}
