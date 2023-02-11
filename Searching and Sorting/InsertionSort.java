import java.util.Scanner;
public class InsertionSort 
{
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	public static void main(String args[])
	{     
		InsertionSort ob = new InsertionSort();
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int[] arr = new int[n];
      	for(int k=0 ; k<n ; k++){
          arr[k] = sc.nextInt();
        }
		ob.sort(arr);
		printArray(arr);
		sc.close();
	}
}