package num46;

import java.util.Scanner;


public class ShanYu {
	public void result()throws Exception{
	Scanner sc=new Scanner(System.in);
	System.out.println("������������n(������)");
	int n=sc.nextInt();
	System.out.println("������kֵ");
	int k=sc.nextInt();
	Single_LinkedCircleList s=new Single_LinkedCircleList();
	
	for(int i=0;i<n;i++) {
		s.insert(i, i+1, k);
		
	}
	System.out.println("λ���"+"---"+"����ֵ");
	s.display();
	Node p = s.head;
	int jj = -1;
	while (jj< n - 1) {
		p = p.next;
		jj++;
	
	}
	p.next=s.head.next;
	

	
	Node prior;
	Node next;
	Node temp=null;
	//System.out.println("�������ʼֵm");
	int m=k;
	prior=s.head;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<m;j++) {
			prior=prior.next;
		}
		temp=prior.next;
		m=temp.password;
	//	System.out.println("��"+i+"�γ���"+temp.data);
		prior.next=temp.next;

}
	System.out.println("n="+n+",k="+k+"��������"+temp.data);
}
}
