import java.util.*;
class ll
{
  node head=null;
  node tail=null;
  class node{
  int data;
   node next;
    node(int data){
    this.data=data;
     next=null;
    }
  }
  public void ins(int x){
    node n = new node(x);
    if(head==null){
      head=n;
      tail=n;
      tail.next=head;
    }
    else{
      tail.next=n;
      tail=n;
      tail.next=head;
    }
  }
  public void display()
  {
    int large=0;
  		node temp = head;
    while(temp!=null)
    {
      if(temp.data>large){
      large=temp.data;}
      temp=temp.next;
    }
    System.out.print(large);
  }
}
public class Insertion_Using_Circular_LinkedList
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    ll n = new ll();
    while(true)
    {
      int x=scan.nextInt();
      if(x<0)
      {break;}
     n.ins(x);
    }
    n.display();
    scan.close();
  }
}