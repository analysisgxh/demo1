import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入关键字值序列，以输入over结束");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		BSTree b=new BSTree();
		/*for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=10) {
		b.insertBST(str.charAt(i), null);
			}
		}*/
		/*if(str=="-1") {
			System.out.println("ss");
		}*/
		while(!str.equals("over")) {
			
			b.insertBST(str,null);
		
			str=sc.next();
		
			
		}
		System.out.println("中根遍历为");
		b.inOrderTraverse(b.root);
		System.out.println("请输入元素x");
		String x=sc.next();
		Object s=b.searchBST(x);
		if(s==null) {
			System.out.println("无"+x);
		}else {
			b.removeBST(x);
			b.inOrderTraverse(b.root);
		}

	}

}
