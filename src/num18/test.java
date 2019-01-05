package num18;
import java.util.*;

public class test {

	public static void main(String[] args) {
		System.out.print("请输入男生数m，女生数n，k首曲子，男生编号x,女生编号y");
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
		System.out.println("男生编号");
		q1.display();
		System.out.println("女生编号");
		q2.display();
		for(int i=1;i<=k;i++) {
			System.out.println("第"+i+"首曲子");
			int j=(Integer)q1.poll();
			int p=(Integer)q2.poll();
			System.out.println("~boy~"+j+"------------"+"~girl~"+p);
			if(j==x&&y==p) {
				c++;
			}
			q1.offer(j);
			q2.offer(p);
			
		}
		System.out.println("boy编号"+x+"和"+"girl编号"+y+"共同跳舞"+c+"次");
		
		// TODO Auto-generated method stub

	}

}
