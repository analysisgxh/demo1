package num33;
import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("A.�Զ������Թ�(��Ҫ����������m������n)---------B.ʹ�ò����Թ�");
		String str=sc.nextLine();
		int[][] p=new int[9][9];
		
		if(str.equals("A")) {
			System.out.println("����������m������n");
			int m=sc.nextInt();
			int n=sc.nextInt();
			 p=new int[m+2][n+2];
			 for(int c=0;c<p[0].length;c++) {
				 p[0][c]=1;
			 }
			 for(int c=0;c<p[m-1].length;c++) {
				 p[m+1][c]=1;
			 }
			 for(int c=1;c<m+1;c++) {
				 p[c][0]=1;
			 }
			 for(int c=1;c<m+1;c++) {
				 p[c][n+1]=1;
			 }
	/* for(int i=0;i<m+2;i++) {
					for(int v=0;v<n+2;v++) {
	                 System.out.print(p[i][v]+" ");

					}
					System.out.println();
				}*/
			 
			 
			 
			for(int i=1;i<=m;i++) {
				for(int v=1;v<=n;v++) {
					p[i][v]=(int)(Math.random()*2);
				}
			}
		//		System.out.println(Arrays.toString(Arrays.toString(p)));
			System.out.println("�Թ��������");
			for(int i=0;i<m+2;i++) {
				for(int v=0;v<n+2;v++) {
                 System.out.print(p[i][v]+" ");

				}
				System.out.println();
			}
			
			
			
		}
		if(str.equals("B")) {
          int[][] q={{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,1,0,0,0,1,0,1},
			{1,0,0,1,0,0,0,1,0,1},
			{1,0,0,0,0,1,1,0,0,1},
			{1,0,1,1,1,0,0,0,0,1},
			{1,0,0,0,1,0,0,0,0,1},
			{1,0,1,0,0,0,1,0,0,1},
			{1,0,1,1,1,0,1,1,0,1},
			{1,1,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}};
          p=q;
          System.out.println("��������");
      	for(int i=0;i<10;i++) {
			for(int v=0;v<10;v++) {
             System.out.print(p[i][v]+" ");

			}
			System.out.println();
		}
          
		// TODO Auto-generated method stub

	}
		System.out.println("�������������i��j");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("�������������");
		int k1=sc.nextInt();
		int k2=sc.nextInt();
		SolvePuzzle sp=new SolvePuzzle();
		sp.passMatrix(p);
		boolean d=sp.seaechPath(i, j, k1, k2, p);
		if(d==true) {
			System.out.println("·��Ϊ");
			sp.display();
			//sp.mp
			System.out.println();
			sp.displaymatrix();
		}else {
			System.out.println("������ͨ·");
		}

}
}
