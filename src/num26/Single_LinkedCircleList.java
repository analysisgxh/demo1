package num26;



public class Single_LinkedCircleList {
	public Node head;

	
	public Single_LinkedCircleList () {
		head = new Node(); 
		head.next=head;
	}

	
	public void clear() {
		head.next=head;
	}

	
	public boolean isEmpty() {
		return head.next.equals(head);
	}

	
	public int length() {
		Node p = head.next;
		int length = 0;
		while (!p.equals(head)) {
			p = p.next;
			++length;
		}
		return length;
	}

	
	public int get(int i) throws Exception {//下标查找,返回位序号1到n
		Node p = head.next;
		int j = 0;
		while (!p.equals(head) && j < i) {
			p = p.next;
			++j;
		}
		if (j > i || p.equals(head)) { 
			throw new Exception("下标异常");
		}
		return p.data;
	}

	
	public void insert(int i, int x,int password) throws Exception {
		Node p = head;
		int j = -1; 
		while ((!p.equals(head) || j == -1) && j < i - 1) {
			p = p.next;
			++j;
		}
		if (j > i - 1 || (p.equals(head) && j != -1)) 
			throw new Exception("下标异常");

		Node s = new Node(x,password); 
		s.next=p.next;
		p.next=s;
	}

	
	public void remove(int i) throws Exception {
		Node p = head;
		int j = -1;
		while ((!p.next.equals(head) || j == -1) && j < i - 1) {
			p = p.next;
			++j;
		}
		if (j > i - 1 || (p.next).equals(head)) { 
			throw new Exception("下标异常");
		}
		p.next=p.next.next;
	}

	
	public int indexOf(int x) {
		Node p = head.next;
		int j = 0;
		while (!p.equals(head)&&p.data!=x) {
			p = p.next;
			++j;
		}
		if (!p.equals(head))
			return j;
		else
			return -1;
	}

	
	public void display() {
		Node node = head.next;
		while (!node.equals(head)) {
			System.out.println("   "+node.data+"------"+node.password);
			node = node.next;
		}
		System.out.println();
	}

}
