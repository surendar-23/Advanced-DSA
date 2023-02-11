import java.util.*;
public class Reverse_Queue{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);int input = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
		while (input >= 0) {q.add(input);input = sc.nextInt();}
        if (q.size() == 0){System.out.println("Queue is empty");return;}
        System.out.println("Before reversing:");
		for (int i : q) System.out.print(i + " ");System.out.println();
        reverse(q);System.out.println("After reversing:");
        for (int i : q) System.out.print(i + " ");}
	public static void reverse(Queue<Integer> q) {
		Stack<Integer> st = new Stack<>();
		while (!q.isEmpty()) st.push(q.remove());
		while (!st.isEmpty()) q.add(st.pop());}}