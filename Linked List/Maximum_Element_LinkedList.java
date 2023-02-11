import java.util.*;
class LinkedList
{
  node head=null;
  node tail=null;
  class node{
    int data;
    node next;
    node(int data)
    {
      this.data=data;
      next=null;
    }
  }
  public void ins(int data)
  {
    node n = new node(data);
    if(head==null){
      head=n;
      tail=n;
    }
    else{
      tail.next=n;tail=n;
    }
  }
public void display()
{
  int large=0;
  node temp = head;
  while(temp!=null){
    if(temp.data>large){
      large=temp.data;
    }
    temp=temp.next;
  }
  System.out.println(large);
	}
  }
public class Maximum_Element_LinkedList{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    LinkedList n = new LinkedList();
    while(true)
    {
      int x = scan.nextInt();
      if(x<0){
        break;}
      n.ins(x);
    }
    n.display();
    scan.close();
  }
}