import java.util.Scanner;
class Adjacency_Matrix{
    public static void  printadjmatrix(int A[][],int rows){
        int i,j;
	    System.out.println("Adjacency Matrix Representation:");
	    for(i=1;i<=rows;i++)
	    {
		    for(j=1;j<=rows;j++)
		    {
		        System.out.print(A[i][j]+" ");
		    }
	        System.out.println();
        }
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,edges,snode,enode,weight;
		System.out.println("Please enter the number of nodes in the graph");
		rows=sc.nextInt();
		System.out.println("Please enter the number of edges in the graph");
		edges=sc.nextInt();
		System.out.println("Is the graph directed");
		String directed=sc.next();
		int A[][]=new int[rows+1][rows+1];
		for(int i=1;i<=rows;i++){
		    for(int j=1;j<=rows;j++){
		        A[i][j]=0;
		    }
		}
		printadjmatrix(A,rows);
		for(int i=1;i<=edges;i++){
		    System.out.println("Enter the start node, end node and weight of edge no "+i);
		    snode=sc.nextInt();
			enode=sc.nextInt();
			weight=sc.nextInt();
		    if((directed.equals("yes"))==true)
				A[snode][enode]=weight;
		    else{
		        A[snode][enode]=weight;
			    A[enode][snode]=weight;
		    }
		}
		printadjmatrix(A,rows);
		sc.close();
	}
}