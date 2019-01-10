package num46;

import java.util.Scanner;


public class ShanYu {
	public void result()throws Exception{
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入总人数n(正整数)");
	int n=sc.nextInt();
	System.out.println("请输入k值");
	int k=sc.nextInt();
	Single_LinkedCircleList s=new Single_LinkedCircleList();
	
	for(int i=0;i<n;i++) {
		s.insert(i, i+1, k);
		
	}
	System.out.println("位序号"+"---"+"报数值");
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
	//System.out.println("请输入初始值m");
	int m=k;
	prior=s.head;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<m;j++) {
			prior=prior.next;
		}
		temp=prior.next;
		m=temp.password;
	//	System.out.println("第"+i+"次出队"+temp.data);
		prior.next=temp.next;

}
	System.out.println("n="+n+",k="+k+"幸运者是"+temp.data);
}
}
