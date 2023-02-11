import java.util.*;
public class Redundant_Braces{
    static boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();char[] str = s.toCharArray();
        for (char ch : str){
          if(ch != ')') st.push(ch);
            else{
                char top = st.pop();boolean operand = false;
                while (top != '(') {
                    if (top == '+' || top == '-' || top == '*' || top == '/') operand = true; top = st.pop();
                }
                if (!operand) return true;}} return false;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);String str = sc.nextLine();
        System.out.println(checkRedundancy(str) ? "Yes" : "No");}}