class Node{
	int data;
	Node next;
	public Node()
	{
		data=0;
		next=null;
	}
}
class MyLL
{
	Node head;
	public MyLL()
	{
		head=null;		
	}
	public void insertAtPosition(int d,int pos)
	{
		int size=count();
		if(pos<1 || pos>size+1)
		{
			System.out.println("Invalid position !!!!");
			return;
		}
		if(pos==1) // call insert at beginning
		{
			insertAtBeginning(d);
			return;
		}
		Node NNode=new Node();
		NNode.data=d;
		Node temp=head;
		
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
		}
		NNode.next=temp.next;
		temp.next=NNode;
		System.out.println("Inserted at position "+pos+" Succsessfully..");
		
	}
	public int count()
	{
		int cnt=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			cnt++;
		}
		return cnt;
	}
	public void insertAtEnd(int d)
	{
		Node n=new Node();
		n.data=d;
		//if LL is empty
		if(head==null)
		{
			head=n;
			return;
		}
		//otherwise move to the last node;
		 Node temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;			 
		 }
		 temp.next=n;
	}
	public void insertAtBeginning(int d)
	{
		Node n=new Node();
		n.data=d;
		if(head==null)// if LL is empty
		{
			head=n;			
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	public void DisplayLL()
	{
		if(head==null)
		{
			System.out.println("LL is empty!!!");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
class LLdemo
{
	public static void main(String[]args)
	{
		MyLL obj=new MyLL();
		System.out.println("Total elements in LL="+ obj.count());
		obj.DisplayLL();
		obj.insertAtEnd(100);
		obj.insertAtEnd(200);
		obj.insertAtEnd(300);
		System.out.println("Total elements in LL="+ obj.count());
		obj.DisplayLL();
		obj.insertAtPosition(150,2);
		System.out.println("Total elements in LL="+ obj.count());
		obj.DisplayLL();
	}
}