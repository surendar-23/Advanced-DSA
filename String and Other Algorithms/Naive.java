import java.util.Scanner;
public class Naive{
	public static void search(String txt, String pat)
	{
		int M = pat.length();
		int N = txt.length();
		for (int i = 0; i <= N-M; i++) {
            int j;
            for (j = 0; j < M; j++)
				if (txt.charAt(i + j) != pat.charAt(j)) break;
			if (j == M)
				System.out.println("Pattern found at index " + i);
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        String pat = scan.nextLine();
		search(txt, pat);
        scan.close();
	}
}
