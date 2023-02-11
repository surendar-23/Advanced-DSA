import java.util.Scanner;
class Tot_NoOfEdges{
    static int totEdge(int n)
    {
     int result = 0; 
     result = (n * (n - 1)) / 2; 
     return result;
    }
     public static void main(String []args){
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt(); 
        scan.close();
        System.out.println(totEdge(n));
    }
}