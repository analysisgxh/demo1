package num38;
import java.util.*;

public class PickMoney {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入总人数n(正整数)");
		int n=sc.nextInt();
		System.out.println("请输入报数值m(m<n)");
		int m=sc.nextInt();
		Single_LinkedCircleList s=new Single_LinkedCircleList();
		
		for(int i=0;i<n;i++) {
			s.insert(i, i+1, m);
			
		}
		System.out.println("位序号"+"---"+"报数");
		s.display();
		Node p = s.head;
		int jj = -1;
		while (jj< n - 1) {
			p = p.next;
			jj++;
		
		}
		p.next=s.head.next;//无头结点;
		//s.head=null;
	//	System.out.println(p.data);
		
		Node prior;
		Node next;
		Node temp=null;
	//	System.out.println("请输入初始值m");
	//	int m=sc.nextInt();
		prior=s.head;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<m;j++) {
				prior=prior.next;
			}
			temp=prior.next;//待删除节点
			m=temp.password;//待删除节点的密码;
			System.out.println("第"+i+"次淘汰"+temp.data);
			prior.next=temp.next;
			
			//System.out.println(prior.data);
	}
		System.out.println("大王编号"+temp.data);
		
		// TODO Auto-generated method stub

	}

}
