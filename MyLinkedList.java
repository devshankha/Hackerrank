
/**
 * This is my own implementation, works partially
 * Problem statement --
 * Given two numbers represented by two linked lists, write a function that returns 
 * sum list. The sum list is linked list representation of addition of two input numbers.
 *  Expected Space Complexity O(1).

Examples:

Input:
L1 = 5 -> 6 -> 3 -> NULL
L2 = 8 -> 4 -> 2 -> NULL
works partially, this gives 14  -0 --3 rather than 1 4  0  3
 */



import java.util.LinkedList;

class Node {
	int data;
	Node next;

	// constructor
	Node(int d) {
		data = d;
		next = null;
	}
}// Node closes
public class MyLinkedList {
	Node head;

	public MyLinkedList() {
		head = null;
	}
	static public MyLinkedList sum (MyLinkedList l1, MyLinkedList l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		MyLinkedList a = l1.reverse();
		MyLinkedList b = l2.reverse();
		a.traverse();
		System.out.println();
		b.traverse();
		
		
		
		
		 MyLinkedList l3 = new MyLinkedList();
		Node x = l1.head;
		Node y = l2.head;
		int c=0;
		while (x != null && y != null ) {
			int d = c+x.data+y.data;
			int k = d%10;
			c = d/10;
			if (x.next != null)
			 l3.insert(k);
			else 
			{
				l3.insert(k);
				l3.insert(c);
			}
			x= x.next;
			y = y.next;
			
		} 
		
		return l3.reverse();
	}
	
	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public void insert (int d) {
		Node temp = new Node(d);
		if (head == null)
			head = temp;
		else {
			Node aux = head;
			while (aux.next != null)
				aux = aux.next;
			aux.next = temp;
		}
	}
	
	public  MyLinkedList reverse() {
		if (head == null)
			return null;
		Node l = head;
		Node temp = null;
		Node count = null;
		while (l != null) {
			count = l.next;
			l.next = temp;
			temp = l;
			l = count;
			
			
			
		} 
		head = temp;
		return this;
	}
	public static void main(String[] args) {
		
		MyLinkedList l1 = new MyLinkedList();
		l1.insert(5);
		l1.insert(6);
		l1.insert(3);
		MyLinkedList l2 = new MyLinkedList();
		l2.insert(8);
		l2.insert(4);
		l2.insert(2);
		 MyLinkedList c=MyLinkedList.sum(l1, l2);
		 System.out.println();
		System.out.println("Before traversing");
		c.traverse(); 
		int d = 12;
		int k = 12%10;
		int kk = 12/10;
		//System.out.println(k);
		//System.out.println(kk);
		
		
		
	}

}
