import java.util.*;
import java.util.Collections;
class BUcketSort {
	static void bucketSort(float arr[], int n)
	{
		if (n <= 0)
			return;
		@SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[n];

		for (int i = 0; i < n; i++) {
			buckets[i] = new Vector<Float>();
		}
		for (int i = 0; i < n; i++) {
			float idx = arr[i] * n;
			buckets[(int)idx].add(arr[i]);
		}
		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);
		}
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				arr[index++] = buckets[i].get(j);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	float[] arr = new float[n];
      	for(int k=0 ; k<n ; k++){
          arr[k] = sc.nextFloat();
        }
		bucketSort(arr, n);
		System.out.println("Sorted array is ");
		for (float el : arr) {
			System.out.print(el + " ");
		}
		sc.close();
	}
}