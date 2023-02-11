import java.util.Scanner;
class Linked_List
{
    static Node head;     
    static class Node
    {
        int data;
        Node next;
        Node(int d) 
        {
            data = d; 
            next = null; 
        }
    }
    Node sortedList(Node head)
    {
        Node prev = head;
        Node curr = head.next;
        while(curr != null)
        {
            if(curr.data < prev.data)
            {
                prev.next = curr.next;
                curr.next = head;
                head = curr;
                curr = prev;
            }
            else
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void display()
    {
      Node temp=head;
      while(temp!=null)
     {
        System.out.print("->"+temp.data);
        temp=temp.next;
     }
    }
}
public class Sort_Linked_List{
public static void main(String args[])
  {
    Linked_List n = new Linked_List();
    try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Total Entries:");
            int len = scan.nextInt();
            for(int z=0;z<len;z++){
                int x = scan.nextInt();
                n.push(x);
            }
            n.sortedList(Linked_List.head);
            n.display();
        }
    }
  }