import java.util.Scanner;
public class Lowest_Common_Ancestor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);int input = sc.nextInt();
		while (input >= 0) { root = insert(root, input);input = sc.nextInt();}
		int x = sc.nextInt(), y = sc.nextInt();Node ans = lowestCommonAncestor(root, x, y);
		System.out.println(ans.data);sc.close();}
	public static Node lowestCommonAncestor(Node root, int x, int y) {
		if (x > root.data && y > root.data) return lowestCommonAncestor(root.right, x, y);
		else if (x < root.data && y < root.data) return lowestCommonAncestor(root.left, x, y);return root;}
  	static Node root = null;
	static class Node {
		int data;Node left, right;
		Node(int data) {this.data = data;}}
	static Node insert(Node root, int data) {
		if (root == null) root = new Node(data);
		else if (root.data < data) root.right = insert(root.right, data);
		else root.left = insert(root.left, data); return root;
}
}