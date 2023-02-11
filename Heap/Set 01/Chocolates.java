import java.util.*;
class Chocolates{
    public static int chocolatesRemained(int[] chocolates,int iterations){
        int remainedChocolates = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->(b-a));
        for(int i=0;i<chocolates.length;i++){q.offer(chocolates[i]);}
        while(iterations > 0){int curr = q.poll();curr = (int) Math.sqrt(curr);q.offer(curr);iterations--;}
        while(!q.isEmpty()){remainedChocolates+=q.poll();}
        return remainedChocolates;}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int[] chocolates = new int[n];
        for(int i=0;i<n;i++){chocolates[i]=sc.nextInt();}
        int iterations = sc.nextInt();
        System.out.println(chocolatesRemained(chocolates,iterations));sc.close();}}