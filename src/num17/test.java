package num17;
import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//中根遍历序列
		System.out.println("请输入先根遍历序列和中根遍历序列");
		String preOrder=sc.nextLine();
		String inOrder=sc.nextLine();
		
	
		if(preOrder.length()!=inOrder.length()) {
			System.out.print("输入有误");
		}else if(!match(preOrder,inOrder)) {
			System.out.print("输入有误");
		}else {
	
		BiTree b=new BiTree(preOrder,inOrder,0,0,preOrder.length());
		System.out.println("后根遍历");
		b.postRootTraverse();
		System.out.println("层次遍历");
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
