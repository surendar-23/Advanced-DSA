import java.util.*;
class Main{
static final int ROW = 5, COL = 5;
boolean isSafe(int M[][], int row, int col,boolean visited[][])
{return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]);}
void DFS(int M[][], int row, int col, boolean visited[][]){
int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
visited[row][col] = true;
for (int k = 0; k < 8; ++k)
if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
DFS(M, row + rowNbr[k], col + colNbr[k], visited);}
int countIslands(int M[][]){
boolean visited[][] = new boolean[ROW][COL];
int count = -1;
for (int i = 0; i < ROW; ++i)
for (int j = 0; j < COL; ++j)
if (M[i][j] == 1 && !visited[i][j]){
DFS(M, i, j, visited);++count;}
return count;}
public static void main(String[] args) throws java.lang.Exception{
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();int n = scan.nextInt();int M[][] = new int[m][n];
for (int x = 0; x < m; x++)
for (int y = 0; y < n; y++) M[x][y] = scan.nextInt();
Main I = new Main();
System.out.println(I.countIslands(M));
scan.close();}}