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
		
		System.out.println("��������Ľ���opt:1.������~~2.�˽���~~3.ʮ����~~4.ʮ������");
		int m=sc.nextInt();
		System.out.println("��������Ҫת�����Ľ���opt:1.������~~2.�˽���~~3.ʮ����~~4.ʮ������");
		int t=sc.nextInt();
		
		//String a=sc.next();
		NumberSystemConversion n=new NumberSystemConversion();
		if(m==1&&t==2) {
			System.out.println("������2������");
		String s=sc.next();
			System.out.println("���������2������"+"---"+s+"---"+"ת��Ϊ�˽���Ϊ"+n.convertTwo_Eeight(s));
			
		}
		if(m==1&&t==3) {
			System.out.println("������2������");
		String s=sc.next();
			System.out.println("���������2������"+"---"+s+"---"+"ת��Ϊʮ����Ϊ"+n.convertTwo_Ten(s));
			
		}
		if(m==1&&t==4) {
			System.out.println("������2������");
		String s=sc.next();
			System.out.println("���������2������"+"---"+s+"---"+"ת��Ϊʮ������Ϊ"+n.convertTwo_Sixteen(s));
			
		}
		
		if(m==2&&t==1) {
			System.out.println("������˽�����");
		String s=sc.next();
			System.out.println("��������ǰ˽�����"+"---"+s+"---"+"ת��Ϊ������Ϊ"+n.convertEeight_Two(s));
			
		}
		if(m==2&&t==3) {
			System.out.println("������˽�����");
		String s=sc.next();
			System.out.println("��������ǰ˽�����"+"---"+s+"---"+"ת��Ϊʮ����Ϊ"+n.convertEeight_Ten(s));
			
		}	
		if(m==2&&t==4) {
			System.out.println("������˽�����");
		String s=sc.next();
			System.out.println("��������ǰ˽�����"+"---"+s+"---"+"ת��Ϊʮ������Ϊ"+n.convertEeight_Sixteen(s));
			
		}
		
		if(m==3&&t==1) {
			System.out.println("������ʮ������");
		int s=sc.nextInt();
			System.out.println("���������ʮ������"+"---"+s+"---"+"ת��Ϊ������Ϊ"+n.convertTen_to_Two(s));
			
		}
		if(m==3&&t==2) {
			System.out.println("������ʮ������");
	int s=sc.nextInt();
			System.out.println("���������ʮ������"+"---"+s+"---"+"ת��Ϊ�˽���Ϊ"+n.convertTen_Eeight(s));
			
		}
		if(m==3&&t==4) {
			System.out.println("������ʮ������");
		int s=sc.nextInt();
			System.out.println("���������ʮ������"+"---"+s+"---"+"ת��Ϊʮ������Ϊ"+n.convertTen_Sixteen(s));
			
		}
		
		if(m==4&&t==1) {
			System.out.println("������ʮ��������");
		String s=sc.next();
			System.out.println("���������ʮ��������"+"---"+s+"---"+"ת��Ϊ������Ϊ"+n.convertSixteen_Two(s));
			
		}
		if(m==4&&t==2) {
			System.out.println("������ʮ��������");
		String s=sc.next();
			System.out.println("���������ʮ��������"+"---"+s+"---"+"ת��Ϊ�˽���Ϊ"+n.convertSixteen_Eeight(s));
			
		}
		if(m==4&&t==3) {
			System.out.println("������ʮ��������");
		String s=sc.next();
			System.out.println("���������ʮ��������"+"---"+s+"---"+"ת��Ϊʮ����Ϊ"+n.convertSixteen_Ten(s));
			
		}
		/*System.out.println("ת��ʮ����Ϊ"+n.convertTwo_Ten(a));
		System.out.println("ת���˽���Ϊ"+n.convertTwo_Eeight(a));
		System.out.println("ת��Ϊʮ������Ϊ"+n.convertTwo_Sixteen(a));
		System.out.println("�˽���ת2����Ϊ"+n.convertEeight_Two(a));
		System.out.println("16����ת2����Ϊ"+n.convertSixteen_Two(a));*/
		
		
		// TODO Auto-generated method stub
		
	
	}
		

}
