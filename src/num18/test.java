package num18;
import java.util.*;

public class test {

	public static void main(String[] args) {
		System.out.print("������������m��Ů����n��k�����ӣ��������x,Ů�����y");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		LinkQueue q1=new LinkQueue();
		LinkQueue q2=new LinkQueue();
		for(int i=1;i<=m;i++) {
			q1.offer(i);
		}
		for(int i=1;i<=n;i++) {
			q2.offer(i);
		}
		int c=0;
		System.out.println("�������");
		q1.display();
		System.out.println("Ů�����");
		q2.display();
		for(int i=1;i<=k;i++) {
			System.out.println("��"+i+"������");
			int j=(Integer)q1.poll();
			int p=(Integer)q2.poll();
			System.out.println("~boy~"+j+"------------"+"~girl~"+p);
			if(j==x&&y==p) {
				c++;
			}
			q1.offer(j);
			q2.offer(p);
			
		}
		System.out.println("boy���"+x+"��"+"girl���"+y+"��ͬ����"+c+"��");
		
		// TODO Auto-generated method stub

	}

}
