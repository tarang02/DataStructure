package achievers;

import java.util.Scanner;

public class RemoveDuplicates {
	
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
			
		}
	}
	static void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	static void removeDuplicate() {
		
		Node current = head;
		while(current!=null) {
			Node check = current.next;
			while(check!=null) {
				if(current.data==check.data) {
					Node  curr = head;
					while(curr.next!=check) {
						curr = curr.next;
					}
					curr.next=check.next;
				}
				check=check.next;
			}
			current = current.next;
		}
		
	}
	static void print()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the linked list");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int v = sc.nextInt();
			insert(v);
		}
		removeDuplicate();
		print();
		
	}

}
