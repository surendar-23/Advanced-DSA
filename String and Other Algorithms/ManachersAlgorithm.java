import java.util.*;
class Main
{
	static void findLPS(String txt)
	{
		int N = txt.length();
		if (N == 0)
			return;
		N = 2 * N + 1; 
		int[] L = new int[N + 1]; 
		L[0] = 0;
		L[1] = 1;
		int C = 1; int R = 2; int i = 0; 
		int iMirror; 
		int maxLen=0;
		int maxCenter=0;
		int start,end,diff=-1;
		for (i = 2; i < N; i++)
		{
			iMirror = 2 * C - i;
			L[i] = 0;
			diff = R - i;
			if (diff > 0)
				L[i] = Math.min(L[iMirror], diff);
			while (((i + L[i]) + 1 < N && (i - L[i]) > 0) && (((i + L[i] + 1) % 2 == 0) || 
                  (txt.charAt((i + L[i] + 1) / 2) == txt.charAt((i - L[i] - 1) / 2))))
			{
				L[i]++;
			}

			if (L[i] > maxLen) 
			{
				maxLen = L[i];
				maxCenter = i;
			}
			if (i + L[i] > R)
			{
				C = i;
				R = i + L[i];
			}
		}
		start = (maxCenter - maxLen) / 2;
		end = start + maxLen - 1;
		System.out.printf(txt);
		for (i = start; i <= end; i++)
			System.out.print(txt.charAt(i));
		System.out.println();
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        String txt = scan.next();
		findLPS(txt);
		scan.close();
	}
}

