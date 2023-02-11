import java.util.Scanner;
public class NaiveSearch {
	static void search(String pat, String txt)
	{
		int M = pat.length();
		int N = txt.length();
		int i = 0, j = N - 1;
		for (i = 0, j = N - 1; j < M;) {
			if (txt.equals(pat.substring(i, j + 1))) {
				System.out.println("Pattern found at index "+ i);
			}
			i++;
			j++;
		}
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        String pat = scan.nextLine();
		search(txt, pat);
        scan.close();
	}
}