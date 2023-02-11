import java.util.*;
class Convert_MinHeap_to_MaxHeap{
    static void MaxHeapify(int arr[], int i, int n){
        int l = 2*i + 1;int r = 2*i + 2;int largest = i;
        if (l < n && arr[l] > arr[i]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;
        if (largest != i){
            int temp = arr[i];arr[i] = arr[largest];arr[largest] = temp;
            MaxHeapify(arr, largest, n);}}
    static void convertMaxHeap(int arr[], int n){
        for (int i = (n-2)/2; i >= 0; --i) MaxHeapify(arr, i, n);}
    static void printArray(int arr[], int size){
        for (int i = 0; i < size; ++i) System.out.print(arr[i]+" ");}
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();int arr[] = new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        convertMaxHeap(arr, n);
        printArray(arr, n);sc.close();}}