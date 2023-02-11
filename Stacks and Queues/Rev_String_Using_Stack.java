import java.util.Scanner;
import java.util.Stack;
public class Rev_String_Using_Stack{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++)
			st.push(str.charAt(i));
		StringBuilder ans = new StringBuilder();
		while (!st.isEmpty()) {
			char ch = st.pop();
			ans.append(ch);
		}
		System.out.println(ans);
		sc.close();
	}
}