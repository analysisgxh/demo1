package num42;
import java.util.*;

public class DaretoDie {
static int n;
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入总人数n(正整数)");
		 n=sc.nextInt();
		System.out.println("报数值m=5");
		//int m=5;
		/*Single_LinkedCircleList s=new Single_LinkedCircleList();
		
		for(int i=0;i<n;i++) {
			s.insert(i, i+1, 5);
			
		}
		System.out.println("位序号"+"---"+"报数");
		s.display();
		Node p = s.head;
		int jj = -1;
		while (jj< n - 1) {
			p = p.next;
			jj++;
		
		}*/
		Single_LinkedCircleList s=create(n);
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
		prior=s.head;
		int b=fianlNumber(prior);
		int j=-1;
		while(b!=1&&j<n){
			j++;
		
			Single_LinkedCircleList s1=create(n);
			prior=s1.get(j);
			Node p1 = s1.head;
			int jj1 = -1;
			while (jj1< n - 1) {
				p1 = p1.next;
				jj1++;
			}
			p1.next=s1.head.next;
			//prior=prior.next;
			b=fianlNumber(prior);
			
			
		}
			
			
		
					System.out.println("从"+prior.next.data+"号位置开始报数"+"1号班长得以不死");
		
		
		//Node prior;
	//	Node next;
	//	Node temp=s.head;
	//	System.out.println("请输入初始值m");
	//	int m=sc.nextInt();
	//	prior=s.head;
		
		//Node c=prior;
	/*	while(temp.data!=1) {
		//	prior=prior.next;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<5;j++) {
				prior=prior.next;
			}
			temp=prior.next;//待删除节点
			m=temp.password;//待删除节点的密码;
			System.out.println("第"+i+"次淘汰"+temp.data);
			prior.next=temp.next;
			
			//System.out.println(prior.data);
	}
		
		System.out.println("大王编号"+temp.data);

c=c.next;
		prior=c;
		
		
		// TODO Auto-generated method stub

	}*/
		
	}
	public static int fianlNumber(Node prior) {
		Node temp=null;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<5;j++) {
				prior=prior.next;
			}
			temp=prior.next;//待删除节点
			//m=temp.password;//待删除节点的密码;
		//	System.out.println("第"+i+"次淘汰"+temp.data);
			prior.next=temp.next;
			
			//System.out.println(prior.data);
	}
		return temp.data;
	//	System.out.println("大王编号"+temp.data);
		
	}
	public static Single_LinkedCircleList create(int n)throws Exception {
Single_LinkedCircleList s=new Single_LinkedCircleList();
		
		for(int i=0;i<n;i++) {
			s.insert(i, i+1, 5);
			
		}
	//	System.out.println("位序号"+"---"+"报数");
		//s.display();
		return s;
	}
}
