import java.util.*;
class Linked_List
{
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Linked_List append(Linked_List list,int data)
    {
        Node newnode=new Node(data);
        Node temp=list.head;
        if(list.head==null)
            list.head=newnode;
        else{
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
        return list;
    }
    public void duplicate(Linked_List list)
    {
        Node temp1,temp2,p;
        temp1=list.head;
        while(temp1!=null)
        {
            temp2=temp1.next;
            p=temp1;
            while(temp2!=null)
            {
                if(temp1.data==temp2.data)
                {
                    p.next=temp2.next;
                    temp2.next=null;
                    temp2=p.next;
                }else{
                    temp2=temp2.next;
                    p=p.next;
                }
            }
            temp1=temp1.next;
        }
    }
    public void display(Linked_List list)
    {
        Node temp=list.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Append_Without_Duplicates
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Linked_List list=new Linked_List();
		int data;
		int c=0;
		do
		{
		    data=s.nextInt();
		    if(data>=0)
		    {
		        c++;
		        list=list.append(list,data);
		    }
		}while(data>=0);
		if(c==0)
		    System.out.println("List is empty");
		else{
		list.duplicate(list);
		list.display(list);
		}
        s.close();
	}
}