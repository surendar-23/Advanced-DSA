import java.util.Scanner;
class linkedList
{
	node head=null;node tail=null;
  	public class node{ 
      int data; node next;
      node(int data){
        this.data = data;
        next = null;
      }}
  	public void ins(int data){
     	node newnode = new node(data);
      	if(head==null){ 
          head = newnode;
          tail = newnode;
        }
      else{
        tail.next = newnode;
        tail = newnode;
      }
    }
  public void display()
  {
    node temp=head;
   while(temp!=null)
   {
   		System.out.println(temp.data);
     temp=temp.next;
   }
  }
  
}
public class Insertion_Element_LinkedList
{
  public static void main(String args[])
  {
    linkedList n = new linkedList();
    Scanner scan = new Scanner(System.in);
    while(true)
    { int x = scan.nextInt();
     if(x<0) break;
      n.ins(x);
    }
    n.display(); scan.close();
  }
}