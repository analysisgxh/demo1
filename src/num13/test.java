package num13;
import java.util.*;

public class test {

	public static void main(String[] args)throws Exception {
		System.out.println("������������");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] w=new int[num];
		HuffmanNode[] h=new HuffmanNode[num];
		System.out.println("�������ַ���Ƶ����");
		for(int i=0;i<num;i++) {
			h[i]=new HuffmanNode();
			h[i].c=sc.next();
			h[i].weight=sc.nextInt();
		}
		
		for(int v=0;v<num;v++) {
			w[v]=h[v].weight;
		}
	//	System.out.print(w[0]+""+w[1]);
		HuffmanTree t=new HuffmanTree();
		int[][] hn=t.huffmanCoding(w);
		for(int i=0;i<hn.length;i++) {
			for(int j=0;j<hn[i].length;j++) {
			System.out.print(hn[i][j]+"~~");
			}
			System.out.println();
		}
		System.out.println("�������������Ϊ");
		for(int i=0;i<hn.length;i++) {
			System.out.print(h[i].c+"---"+w[i]+"---");
			for(int j=0;j<hn[i].length;j++) {
				if(hn[i][j]==-1) {
					for(int k=j+1;k<hn[i].length;k++) {
						System.out.print(hn[i][k]);
					}
					break;
				}
			}
			System.out.println();
		}
		//System.out.println(t.get().length);
		System.out.println("��������Ҫ�����2���Ʊ���");
		//int m
		Scanner scp=new Scanner(System.in); 
		String str=scp.nextLine();
		int k=t.decode(str,t.get()[(t.get().length)-1]);
		System.out.println("����Ϊ"+k);
		for(int i=0;i<num;i++) {
			if(h[i].weight==k) {
				System.out.println(h[i].c);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
