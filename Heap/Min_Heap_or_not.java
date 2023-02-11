import java.util.*;
class Min_Heap_or_not{
    public static boolean checkMinHeap(int[] A, int i){
        if (2*i + 2 > A.length) return true;
        boolean left = (A[i] <= A[2*i + 1]) && checkMinHeap(A, 2*i + 1);
        boolean right = (2*i + 2 == A.length) || (A[i] <= A[2*i + 2] && checkMinHeap(A, 2*i + 2));
        return left && right;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int[] arr = new int[n];
        for(int i=0;i<n;i++) {arr[i]=sc.nextInt();}
        int index = 0;
        if (checkMinHeap(arr, index)) System.out.println("Given array is a min heap");
        else System.out.println("Given array is not a min heap");sc.close();}}