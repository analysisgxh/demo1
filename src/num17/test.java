package num17;
import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//�и���������
		System.out.println("�������ȸ��������к��и���������");
		String preOrder=sc.nextLine();
		String inOrder=sc.nextLine();
		
	
		if(preOrder.length()!=inOrder.length()) {
			System.out.print("��������");
		}else if(!match(preOrder,inOrder)) {
			System.out.print("��������");
		}else {
	
		BiTree b=new BiTree(preOrder,inOrder,0,0,preOrder.length());
		System.out.println("�������");
		b.postRootTraverse();
		System.out.println("��α���");
		b.levelTraverse();
		}
		
		
		

	}
	public  static boolean match(String preOrder,String inOrder) {
		int c=0;
		for(int i=0;i<preOrder.length();i++) {
			for(int v=0;v<inOrder.length();v++) {
				if(preOrder.charAt(i)==inOrder.charAt(v)) {
					c++;
				}
			}
		}
		if(c==preOrder.length()) {
			return true;
		}
		return false;
	}

}
