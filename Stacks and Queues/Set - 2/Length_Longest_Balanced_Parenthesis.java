import java.util.*;
public class Length_Longest_Balanced_Parenthesis{
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);String str = sc.nextLine();
        System.out.println(longestValidParentheses(str));}
	public static int longestValidParentheses(String s){
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;int left = -1;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '(') stack.push(j);
            else {
                if (stack.isEmpty()) left = j;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max = Math.max(max, j - left);
                    else max = Math.max(max, j - stack.peek());}}}
        return max;
    }}