import java.util.Scanner;
public class Rotate_Doubly_LinkedList{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);int T = sc.nextInt();
		while (T-- > 0) {
			doublyLinkedList list = new doublyLinkedList();
			int size = sc.nextInt();int toRotate = sc.nextInt();
			for (int i = 0; i < size; i++)
				list.addNode(sc.nextInt());list.rotate(toRotate);list.display();
		}sc.close();}
	static class Node {
		int data;Node next, prev;
		Node(int data) {this.data = data;
		}
	}
	static class doublyLinkedList {
		Node head, tail;int size = 0;
		public void rotate(int p) {
			Node temp = head;int count = 1;
			while (count < p) {
				temp = temp.next;
				count++;}
			Node next = temp.next;temp.next = null;tail.next = head;tail = temp;head = next;head.prev = null;}
		public void addNode(int input) {
			Node newNode = new Node(input);
			if (head == null) {
				head = tail = newNode;return;}
			tail.next = newNode;newNode.prev = tail;tail = newNode;
		}
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");temp = temp.next;}System.out.println();}}}