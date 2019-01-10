package num46;

public class Node {
	public int data; 
	public int password;

	public Node next; 

	public Node() { 
		this(-1, -1,null);
	}

	public Node(int data,int password) { 
		this(data, password,null);
	}

	public Node(int data,int password, Node next) {
		this.data = data;
		this.password=password;
		this.next = next;
	}
}
