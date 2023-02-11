import java.util.Scanner;
class linked_List
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
    public linked_List append(linked_List list,int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(list.head==null)
            list.head=newnode;
        else
        {
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
        return list;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete()
    {
        Node temp=head;
        head=temp.next;
        temp.next=null;
    }
    
}
public class Delete_Element_In_LinkedList
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		linked_List list=new linked_List();
		int data;
		do
		{
		    data=s.nextInt();
		    if(data>=0)
		        list=list.append(list,data);
		}while(data>=0);
		list.delete();
		list.display();
        s.close();
		
	}
}