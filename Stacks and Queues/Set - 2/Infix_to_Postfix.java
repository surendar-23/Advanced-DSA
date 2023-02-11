import java.util.Scanner;
import java.util.Stack;
public class Infix_to_Postfix{
  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);String s = sc.next();
		System.out.println(infixToPreFix(s));sc.close();}
	public static int precedence(char c) {
		switch (c) {
		case '+':
		case '-': return 1;
		case '*':
		case '/': return 2;
		case '^': return 3;}
		return -1;}
	public static StringBuilder infixToPreFix(String expression) {
		StringBuilder result = new StringBuilder(); StringBuilder input = new StringBuilder(expression);
        input.reverse();
		Stack<Character> stack = new Stack<Character>(); char[] charsExp = new String(input).toCharArray();
		for (int i = 0; i < charsExp.length; i++) {
			if (charsExp[i] == '(') charsExp[i] = ')';
			else if (charsExp[i] == ')') charsExp[i] = '(';}
		for (int i = 0; i < charsExp.length; i++) {
			char c = charsExp[i];
			if (precedence(c) > 0) {
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) result.append(stack.pop());stack.push(c);}
			else if (c == ')') {
				char x = stack.pop();while (x != '(') {result.append(x);x = stack.pop();}}
			else if (c == '(') stack.push(c);
			else result.append(c);}
		for (int i = 0; i <= stack.size(); i++) {result.append(stack.pop());}
		return result.reverse();}}