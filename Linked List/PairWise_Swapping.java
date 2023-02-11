import java.util.Scanner;
public class PairWise_Swapping{
	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (input >= 0) {
			list.addNode(input);input = sc.nextInt();
		}
		list.pairSwap();list.display();
		sc.close();
	}
	static class Node {
		int data;Node next;
		Node(int data) {
			this.data = data;}
}
	static class LinkedList {
		Node head, tail;int size = 0;
		public void pairSwap() {
			if (head == null || head.next == null) return;
			Node temp = head;
			while (temp != null && temp.next != null) {
				int val = temp.data;temp.data = temp.next.data;temp.next.data = val;temp = temp.next.next;}
		}
		public void display() {
			if (head == null) {
				System.out.println("List is empty");
				return;
			}
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);temp = temp.next;}
		}
		public void addNode(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = tail = newNode;return;
			}
			tail.next = newNode;
			tail = newNode;}}
}