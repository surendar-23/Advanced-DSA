
import java.util.Scanner;
public class BST_Degree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);int input = sc.nextInt();
		while (input >= 0) {root = insert(root, input);input = sc.nextInt();}
		int answer = diameter(root);System.out.println("Diameter of the given binary tree is " + answer);sc.close();
	}
  	static Node root = null;  
	public static int diameter(Node root) {
		if (root == null) return 0;
		int left = diameter(root.left);int right = diameter(root.right);
		int leftHeight = height(root.left);int rightHeight = height(root.right);
        int maxPath = 1 + leftHeight + rightHeight;
		return Math.max(maxPath, Math.max(left, right));}
	public static int height(Node root) {
		if (root == null) return 0;
		int left = height(root.left);int right = height(root.right);return 1 + Math.max(left, right);}
	static class Node {
		int data;Node left, right;
		Node(int data) { this.data = data;}}
	static Node insert(Node root, int data) {
		if (root == null) root = new Node(data);
		else if (root.data < data) root.right = insert(root.right, data);
		else root.left = insert(root.left, data);
		return root;}}