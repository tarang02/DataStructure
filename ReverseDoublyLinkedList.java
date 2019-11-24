package achievers;

import java.util.Scanner;

public class ReverseDoublyLinkedList {
	
	static Node head=null;
	static Node tail=null;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	
	void insertNode(int d) {
		Node new_Node = new Node(d);
		if(head==null) {
			head = new_Node;
			tail = new_Node;
			return;
		}
		tail.next = new_Node;
		new_Node.prev = tail;
		tail = new_Node;
	}
	
	void print() {
		System.out.print("Reverse list is :  ");
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + "  ");
			curr=curr.next;
		}
	}
	
	void reverse() {
		Node curr = head;
		while(curr!=null) {	
			Node temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			
			curr=curr.prev;
		}
		Node temp = head;
		head=tail;
		tail=temp;
	}
	
	public static void main(String[] args) {
		ReverseDoublyLinkedList rl =  new ReverseDoublyLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want to enter in list");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" values in list");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			rl.insertNode(a);
		}
		rl.reverse();
		rl.print();
		
	}
}
