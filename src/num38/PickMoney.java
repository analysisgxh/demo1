package num38;
import java.util.*;

public class PickMoney {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������n(������)");
		int n=sc.nextInt();
		System.out.println("�����뱨��ֵm(m<n)");
		int m=sc.nextInt();
		Single_LinkedCircleList s=new Single_LinkedCircleList();
		
		for(int i=0;i<n;i++) {
			s.insert(i, i+1, m);
			
		}
		System.out.println("λ���"+"---"+"����");
		s.display();
		Node p = s.head;
		int jj = -1;
		while (jj< n - 1) {
			p = p.next;
			jj++;
		
		}
		p.next=s.head.next;//��ͷ���;
		//s.head=null;
	//	System.out.println(p.data);
		
		Node prior;
		Node next;
		Node temp=null;
	//	System.out.println("�������ʼֵm");
	//	int m=sc.nextInt();
		prior=s.head;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<m;j++) {
				prior=prior.next;
			}
			temp=prior.next;//��ɾ���ڵ�
			m=temp.password;//��ɾ���ڵ������;
			System.out.println("��"+i+"����̭"+temp.data);
			prior.next=temp.next;
			
			//System.out.println(prior.data);
	}
		System.out.println("�������"+temp.data);
		
		// TODO Auto-generated method stub

	}

}
