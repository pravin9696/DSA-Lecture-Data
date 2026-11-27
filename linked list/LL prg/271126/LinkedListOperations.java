class Node {
	int data; // data store int value
	Node next;// reference variable store address of another Node type object
	// constructor

	public Node() {

	}

	public Node(int dd) {
		data = dd;
		next = null;
	}

}

class MyLinkedList {
	Node head = null;

	public void displayLL() {

		if (head == null) {
			System.out.println("LL is Empty!!!");
		} else {
			Node temp = head;
			System.out.println();
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.print("null  \n");
		}
	}

	public int count() {
		int c = 0;
		Node temp = head;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}

	public void insertAtPosition(int d, int p)// d==> data p==> position
	{
		int size = count();// 4
		if (p < 1 || p > size + 1)// for wrong position provided
		{
			System.out.println("Wrong position number provided!!!!");
		} else {

			// if position is first
			if (p == 1) {
				insertAtBegnning(d);
			} else if (p == size) // insert at end
			{
				insertAtEnd(d);
			} else {
				Node nn = new Node(d);
				int i = 1;
				Node temp = head;
				while (i < p-1) {
					temp = temp.next;
					i++;
				}

				nn.next = temp.next;
				temp.next = nn;
			}
		}

	}

	public void insertAtEnd(int d) {
		Node nn = new Node(d);
		// if LL is empty
		if (head == null) {
			head = nn;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nn;
		}
	}

	public void insertAtBegnning(int d) {
		Node nn = new Node(d);

		if (head == null) {
			head = nn;
		} else {
			// store address of head into nn.next
			nn.next = head;
			head = nn;
		}

	}

}

// create link list

class LinkedListOperations {
	public static void main(String[] args) {

		MyLinkedList obj = new MyLinkedList();
		int cc;

		obj.insertAtEnd(100);
		obj.insertAtEnd(200);
		obj.insertAtEnd(300);
		obj.insertAtEnd(400);
		cc = obj.count();
		System.out.println("Total elements in LL = " + cc);
		obj.insertAtPosition(999, 6);
		obj.displayLL();
		cc = obj.count();
		System.out.println("Total elements in LL = " + cc);

	}
}