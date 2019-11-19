package achievers;

import java.util.Scanner;

public class RotateLinkedList {

	static Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void insertNode(int new_data) {
		
		Node new_node = new Node(new_data);
		if(head==null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last_node = head;
		
		while(last_node.next!=null)
			last_node = last_node.next;
		last_node.next = new_node;
		return;
	}
	
	void rotate(int r) {
		for(int i=0;i<r;i++) {
			Node a =null;
			a=head;
			head=head.next;
			Node node = head;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = a;
			a.next=null;
		}
	}
	
	public void printList() {
		
		Node temp_node = head;
		while(temp_node != null) {
			System.out.println(temp_node.data+" ");
			temp_node = temp_node.next;
		}
	}
	
	public static void main(String[] args) {
		RotateLinkedList rd = new RotateLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of Noded you want to insert");
		int n = sc.nextInt();
		System.out.println("Enter values in Nodes");
		for(int i=0;i<n;i++) {
			int a= sc.nextInt();
			rd.insertNode(a);
		}
		System.out.println("Enter number of rotations");
		int r = sc.nextInt();
		rd.rotate(r);
		rd.printList();

	}

}
