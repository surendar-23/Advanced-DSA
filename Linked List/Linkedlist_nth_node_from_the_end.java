import java.util.*;
class LinkedList
{
    Node head;
    static class Node{
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public LinkedList append(LinkedList list,int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(list.head==null)
            list.head=newnode;
        else{
            while(temp.right!=null)
                temp=temp.right;
            temp.right=newnode;
            newnode.left=temp;
        }
        return list;
    }
    public void nthNode(int pos)
    {
        Node temp=head;
        while(temp.right!=null)
            temp=temp.right;
        while(pos!=1)
        {
            temp=temp.left;
            pos--;
        }
        if(temp==null)
            System.out.println("There is no nth node in the list");
        else
            System.out.println(temp.data+" is the nth node element in the list");
    }
}
public class Linkedlist_nth_node_from_the_end
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int data;
		do
		{
		    data=s.nextInt();
		    if(data>=0)
		        list=list.append(list,data);
		}while(data>=0);
		System.out.println("Enter the nth node:");
		int pos=s.nextInt();
		list.nthNode(pos);
        s.close();
	}
}