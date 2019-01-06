package Num24;

import java.util.Scanner;


public class Doubli_linkedCircleList {
public DuLNode head;

	
	public Doubli_linkedCircleList() {
		head = new DuLNode(); 
		head.prior=head;
		head.next=head;
	}

	
	public Doubli_linkedCircleList(int n) throws Exception {
		this();
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < n; j++)
			insert(0, sc.next());
	}

	
	
	public void insert(int i, Object x) throws Exception {
		DuLNode p = head.next;
		int j = 0;
		while (!p.equals(head) && j < i) {
			p = p.next;
			++j;
		}

		if (j != i && !p.equals(head)) 
			throw new Exception("插入异常");

		DuLNode s = new DuLNode(x);
		p.prior.next=s;
		s.prior=p.prior;
		s.next=p;
		p.prior=s;
	}

	
	public void remove(int i) throws Exception {
		DuLNode p = head.next;
		int j = 0;
		while (!p.equals(head) && j < i) {
			p = p.next;
			++j;
		}

		if (j != i) 
			throw new Exception("删除异常");

		p.prior.next=p.next;
		p.next.prior=p.prior;
	}

	
	public void clear() {
		head.prior=head;
		head.next=head;
	}

	
	public boolean isEmpty() {
		return head.equals(head.next);
	}

	
	public Object get(int i) throws Exception {
		DuLNode p = head.next;
		int j = 0;
		while (!p.equals(head) && j < i) {
			p = p.next;
			++j;
		}
		if (j > i || p.equals(head)) { 
			throw new Exception("异常" + i + "！");
		}
		return p.data;
	}

	
	public int length() {
		DuLNode p = head.next;
		int length = 0;
		while (!p.equals(head)) {
			p = p.next;
			++length;
		}
		return length;
	}

	
	public int indexOf(Object x) {
		DuLNode p = head.next;
		int j = 0;
		while (!p.equals(head) && !p.data.equals(x)) {
			p = p.next;
			++j;
		}
		if (!p.equals(head))
			return j;
		else
			return -1;
	}

	public void display() {
		DuLNode node = head.next;
		while (!node.equals(head)) {
			System.out.print(node.data.toString()
					+ " ");
			node = node.next;
		}
		System.out.println();
	}

	public DuLNode getHead() {
		return head;
	}

	public void setHead(DuLNode head) {
		this.head = head;
	}

}
