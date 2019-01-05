package Num20;
import java.util.*;
import java.*;
import java.io.File;


public class test {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		
		Runtime ce=Runtime.getRuntime();
		File f=new File("C:/windows\\system32","calc.exe");
		ce.exec(f.getAbsolutePath());
		
		System.out.println("请输入你的进制opt:1.二进制~~2.八进制~~3.十进制~~4.十六进制");
		int m=sc.nextInt();
		System.out.println("请输入你要转换到的进制opt:1.二进制~~2.八进制~~3.十进制~~4.十六进制");
		int t=sc.nextInt();
		
		//String a=sc.next();
		NumberSystemConversion n=new NumberSystemConversion();
		if(m==1&&t==2) {
			System.out.println("请输入2进制数");
		String s=sc.next();
			System.out.println("你输入的是2进制数"+"---"+s+"---"+"转换为八进制为"+n.convertTwo_Eeight(s));
			
		}
		if(m==1&&t==3) {
			System.out.println("请输入2进制数");
		String s=sc.next();
			System.out.println("你输入的是2进制数"+"---"+s+"---"+"转换为十进制为"+n.convertTwo_Ten(s));
			
		}
		if(m==1&&t==4) {
			System.out.println("请输入2进制数");
		String s=sc.next();
			System.out.println("你输入的是2进制数"+"---"+s+"---"+"转换为十六进制为"+n.convertTwo_Sixteen(s));
			
		}
		
		if(m==2&&t==1) {
			System.out.println("请输入八进制数");
		String s=sc.next();
			System.out.println("你输入的是八进制数"+"---"+s+"---"+"转换为二进制为"+n.convertEeight_Two(s));
			
		}
		if(m==2&&t==3) {
			System.out.println("请输入八进制数");
		String s=sc.next();
			System.out.println("你输入的是八进制数"+"---"+s+"---"+"转换为十进制为"+n.convertEeight_Ten(s));
			
		}	
		if(m==2&&t==4) {
			System.out.println("请输入八进制数");
		String s=sc.next();
			System.out.println("你输入的是八进制数"+"---"+s+"---"+"转换为十六进制为"+n.convertEeight_Sixteen(s));
			
		}
		
		if(m==3&&t==1) {
			System.out.println("请输入十进制数");
		int s=sc.nextInt();
			System.out.println("你输入的是十进制数"+"---"+s+"---"+"转换为二进制为"+n.convertTen_to_Two(s));
			
		}
		if(m==3&&t==2) {
			System.out.println("请输入十进制数");
	int s=sc.nextInt();
			System.out.println("你输入的是十进制数"+"---"+s+"---"+"转换为八进制为"+n.convertTen_Eeight(s));
			
		}
		if(m==3&&t==4) {
			System.out.println("请输入十进制数");
		int s=sc.nextInt();
			System.out.println("你输入的是十进制数"+"---"+s+"---"+"转换为十六进制为"+n.convertTen_Sixteen(s));
			
		}
		
		if(m==4&&t==1) {
			System.out.println("请输入十六进制数");
		String s=sc.next();
			System.out.println("你输入的是十六进制数"+"---"+s+"---"+"转换为二进制为"+n.convertSixteen_Two(s));
			
		}
		if(m==4&&t==2) {
			System.out.println("请输入十六进制数");
		String s=sc.next();
			System.out.println("你输入的是十六进制数"+"---"+s+"---"+"转换为八进制为"+n.convertSixteen_Eeight(s));
			
		}
		if(m==4&&t==3) {
			System.out.println("请输入十六进制数");
		String s=sc.next();
			System.out.println("你输入的是十六进制数"+"---"+s+"---"+"转换为十进制为"+n.convertSixteen_Ten(s));
			
		}
		/*System.out.println("转换十进制为"+n.convertTwo_Ten(a));
		System.out.println("转换八进制为"+n.convertTwo_Eeight(a));
		System.out.println("转换为十六进制为"+n.convertTwo_Sixteen(a));
		System.out.println("八进制转2进制为"+n.convertEeight_Two(a));
		System.out.println("16进制转2进制为"+n.convertSixteen_Two(a));*/
		
		
		// TODO Auto-generated method stub
		
	
	}
		

}
