package Num19;

public class Link_countPeach {
	public static Node head=new Node();;

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int x=1;
		for(int i=0;i<10;i++) {
			
			insert(i,x);
			x=2*x+2;
		}
		Node c=head.next;
		while(c!=null) {
			
		
		System.out.println(c.data);
		c=c.next;
		}
		Node m=head.next;
		int j=0;
		while(j<9) {
			m=m.next;
			++j;
		}
		System.out.println("第一天有桃子"+m.data);
		
		

	}
	public static void insert(int i, Object x) throws Exception {
	
		Node p = head;
		int j = -1; 
		while (p != null && j < i - 1) {
			p = p.next;
			++j;
		}
		if (j > i - 1 || p == null) 
			throw new Exception("下标不合法");

		Node s = new Node(x); 
		s.next=p.next;//
		p.next=s;
	}

}
