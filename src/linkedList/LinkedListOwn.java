package linkedList;

import java.util.LinkedList;

public class LinkedListOwn<Item> {
	  Node<Item> head ;
	
	public class Node<Item>{
		  Item item;
		  Node<Item> next;
		  public Node(Item itemin){
			  item = itemin;
		  }
	  }
	
	public void add(Item item){
		
		Node newElement = new Node(item);
		newElement.next = head;
		head = newElement;
	}
	
	public void add(Node prevNode, Item item){
		Node newNode = new Node<>(item);
		newNode.next = prevNode.next;
		prevNode.next= newNode;
		
	}
	
	
	public static void main(String[] args){
		LinkedListOwn<Integer> list = new LinkedListOwn<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
	}

}
