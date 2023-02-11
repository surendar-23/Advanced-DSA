import java.util.*;
class Node{
 int data;
 Node next;
 Node(int d) {data = d;
    next = null;}}
class MergeLists{
Node head;
public void addToTheLast(Node node)
{
 if (head == null)
 {
  head = node;
 }
 else
 {
  Node temp = head;
  while (temp.next != null)
   temp = temp.next;
  temp.next = node;
 }
}
void printList()
{
 Node temp = head;
 while (temp != null)
 {
  System.out.print(temp.data + "->");
  temp = temp.next;
 }
 System.out.println("NULL");
}
}
public class MergeTwoSortedLists
{
  public static void main(String args[])
{

    Scanner scan = new Scanner(System.in);
    MergeLists llist1 = new MergeLists();
    MergeLists llist2 = new MergeLists();
    int x = scan.nextInt();
    for(int i=0;i<x;i++)
    {
        int y = scan.nextInt();
        llist1.addToTheLast(new Node(y));
    }
    int z = scan.nextInt();
    for(int i=0;i<z;i++)
    {
        int k = scan.nextInt();
        llist2.addToTheLast(new Node(k));
    }
 llist1.head = new MergeTwoSortedLists().sortedMerge(llist1.head,llist2.head);
 llist1.printList(); 
 scan.close();
}
Node sortedMerge(Node headA, Node headB)
{
 Node dummyNode = new Node(0);
 Node tail = dummyNode;
 while(true)
 {
  if(headA == null)
  {
   tail.next = headB;
   break;
  }
  if(headB == null)
  {
   tail.next = headA;
   break;
  }
  if(headA.data <= headB.data)
  {
   tail.next = headA;
   headA = headA.next;
  }
  else
  {
   tail.next = headB;
   headB = headB.next;
  }
  tail = tail.next;
 }
 return dummyNode.next;
}
}