import java.util.Scanner;
class KMP_String_Matching {
	void KMPSearch(String pat, String text)
	{
		int M = pat.length();
		int N = text.length();
		int lps[] = new int[M];
		int j = 0; 
		computeLPSArray(pat, M, lps);
		int i = 0; 
		while ((N - i) >= (M - j)) {
			if (pat.charAt(j) == text.charAt(i)) {
				j++;
                i++;
			}
			if (j == M) {
				System.out.println("Found pattern at index " + (i - j));
				j = lps[j - 1];
			}
			else if (i < N && pat.charAt(j) != text.charAt(i)) {
				if (j != 0) j = lps[j - 1];
				else j = i + 1;
			}
		}
	}
	void computeLPSArray(String pat, int M, int lps[])
	{

		int len = 0;
		int i = 1;
		lps[0] = 0; 
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else
			{

				if (len != 0) {
					len = lps[len - 1];
				}
				else 
				{
					lps[i] = len;
					i++;
				}
			}
		}
	}
	public static void main(String args[])
	{
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String pat = scan.nextLine();
        new KMP_String_Matching().KMPSearch(pat, text);
        scan.close();
	}
}