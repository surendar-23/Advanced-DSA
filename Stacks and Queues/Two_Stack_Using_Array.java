import java.util.Scanner;
public class Two_Stack_Using_Array{
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in); TwoStacks st = new TwoStacks(1000); int size1 = sc.nextInt();
		for (int i = 0; i < size1; i++)
			st.push1(sc.nextInt());
		int size2 = sc.nextInt();
		for (int i = 0; i < size2; i++)
			st.push2(sc.nextInt());
		System.out.println("Stack 1 Elements: "); st.print1(); System.out.println("Stack 2 Elements: "); st.print2(); int deleteFirst = sc.nextInt();
		while (deleteFirst-- > 0)
			st.pop1();
		System.out.println("Stack 1 Elements: "); st.print1(); int deleteSecond = sc.nextInt();
		while (deleteSecond-- > 0)
			st.pop2();
		System.out.println("Stack 2 Elements: "); st.print2(); sc.close(); }
	static class TwoStacks {
		int size,top1,top2,arr[];
		TwoStacks(int n) {
			arr = new int[n]; size = n; top1 = -1; top2 = size;}
		void push1(int x) {
			if (top1 < top2 - 1) { top1++; arr[top1] = x;}
			else System.out.println("Stack Overflow");}
		void push2(int x) { if (top1 < top2 - 1) { top2--; arr[top2] = x;}
			else System.out.println("Stack Overflow");}
		int pop1() {
			if (top1 >= 0) { int x = arr[top1]; top1--; return x; }
			else System.out.println("Stack underflow. pop from stack 1 failed"); return 0;}
		int pop2() {
			if (top2 < size) { int x = arr[top2]; top2++; return x; }
			else System.out.println("Stack Underflow"); return 0; }
		void print1() {
			int temp = top1; while (temp >= 0) { System.out.print(arr[temp] + " "); temp--;} System.out.println();}
		void print2() { int temp = top2; while (temp < size) { System.out.print(arr[temp] + " "); temp++;} System.out.println();}}}