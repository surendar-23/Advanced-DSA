import java.util.Scanner;
public class Deletion_Of_Second_LastElement{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (input >= 0) {
			list.addNode(input);
			input = sc.nextInt();
		}
		list.deleteSecondLast();
		sc.close();
	}
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;}
	}
	static class LinkedList {
		Node head, tail;
		int size = 0;
		public void deleteSecondLast() {
			if (head == null || head.next == null) {
				System.out.println("Deletion of second last element is not possible");
				return;
			}
			if (head.next.next == null) {
				head = head.next;
				System.out.println(head.data);
				return;
			}
			Node temp = head, prev = null;
			while (temp.next.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
			display();}
		public void addNode(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;}}}}