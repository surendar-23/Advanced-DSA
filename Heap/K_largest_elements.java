import java.util.ArrayList;
import java.util.Scanner;
class K_largest_elements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int k = sc.nextInt();int arr[] = new int[n];
        for(int i = 0; i<n; ++i) arr[i] = sc.nextInt();
        Solution T = new Solution();
        ArrayList<Integer> list = T.kLargest(arr, n, k);
        for(int i = 0; i<list.size(); i++) System.out.print(list.get(i) + " ");sc.close();}}
class Solution{
    public ArrayList<Integer> kLargest(int arr[], int n, int k){
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=n/2-1;i>=0;i--) heapify(arr,i,n); 
        for(int i=0;i<k;i++){a.add(arr[0]);arr[0]=arr[n-1];n--;heapify(arr,0,n);}return a;
    }
    static void heapify(int a[],int i,int n){
        int max=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && a[l]>a[max])
        max=l;
        if(r<n && a[r]>a[max])
        max=r;
        if(i!=max)
        {
            int swap=a[i];
            a[i]=a[max];
            a[max]=swap;
            heapify(a,max,n);
        }
    }
}