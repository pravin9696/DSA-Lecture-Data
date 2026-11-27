class Node
{
	int data;  // data store int value
	Node next;// reference variable  store address of another Node type object
}

// create link list

class LinkedListDemo
{
	public static void main(String []args)
	{
		Node head=null;//
		// create two notes
		
		Node n1=new Node();
		n1.data=100;
		n1.next=null;
		
		
		Node n2=new Node();
		n2.data=200;
		n2.next=null;
		
		// link secondd node to the first node
		
		
		n1.next=n2;
		
		head=n1;
		
		
		//display linked list
		
		Node temp;
		
		temp=head;
		
		System.out.println(temp.data);
		temp=temp.next;
		System.out.println(temp.data);
		
		
	}
}