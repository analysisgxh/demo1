package Num24;
import java.util.*;

public class test {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("A*****请输入你的第一个整数****A");
		String m=sc.next();
		System.out.println("A*****请输入你的第2个整数****A");
		String y=sc.next();
		//--
		if(String.valueOf(m.charAt(0)).equals("-")&&String.valueOf(y.charAt(0)).equals("-")) {
			String m11=m.substring(1);
			String y11=y.substring(1);
			
			int vb;
			caculate op=new caculate();
			int tu=op.feidouhaozifutongji(m11);
			int tw=op.feidouhaozifutongji(y11);
			if(tu>tw) {
				vb=tu-tw;
				for(int v=0;v<vb;v++) {
					y11="0"+y11;
					
				}
				
				
			
			}
			if(tu<tw){
				vb=tw-tu;
				for(int v=0;v<vb;v++) {
					m11="0"+m11;
				}
				
				
				
			}
			
			String[] m1=m11.split(",");
			
			String[] y1=y11.split(",");
		
			String m2=op.StringArrayToString(m1);
			String y2=op.StringArrayToString(y1);
			
			String m3=op.divide(m2);
			String y3=op.divide(y2);
			
			
			
			
		
			
			
			
			String[] d=m3.split(",");
			Doubli_linkedCircleList a=new Doubli_linkedCircleList();
			for(int v=d.length-1;v>=0;v--) {
				a.insert(0, d[v]);
			}
			
			
			
			
		
			
			
			String[] s=y3.split(",");
			Doubli_linkedCircleList b=new Doubli_linkedCircleList();
			for(int v=s.length-1;v>=0;v--) {
				b.insert(0, s[v]);
			}
			
		
			System.out.println("-"+tiaozheng(op.add(a, b)));
			
			
			
			

		
		}
		//++
		if(!String.valueOf(m.charAt(0)).equals("-")&&!String.valueOf(y.charAt(0)).equals("-")) {
		 int vb;
		caculate op=new caculate();
		int tu=op.feidouhaozifutongji(m);
		int tw=op.feidouhaozifutongji(y);
		if(tu>tw) {
			vb=tu-tw;
			for(int v=0;v<vb;v++) {
				y="0"+y;
				
			}
			
			
		
		}
		if(tu<tw){
			vb=tw-tu;
			for(int v=0;v<vb;v++) {
				m="0"+m;
			}
			
			
			
		}
		
		String[] m1=m.split(",");
		
		String[] y1=y.split(",");
	
		String m2=op.StringArrayToString(m1);
		String y2=op.StringArrayToString(y1);
		
		String m3=op.divide(m2);
		String y3=op.divide(y2);
		
		
		
		
	
		
		
		
		String[] d=m3.split(",");
		Doubli_linkedCircleList a=new Doubli_linkedCircleList();
		for(int v=d.length-1;v>=0;v--) {
			a.insert(0, d[v]);
		}
		
		
		
		
	
		
		
		String[] s=y3.split(",");
		Doubli_linkedCircleList b=new Doubli_linkedCircleList();
		for(int v=s.length-1;v>=0;v--) {
			b.insert(0, s[v]);
		}
		a.display();
		b.display();
		
	
		System.out.println(tiaozheng(op.add(a, b)));
		
		
		
		

	}
		if(String.valueOf(m.charAt(0)).equals("-")&&!String.valueOf(y.charAt(0)).equals("-")) {
			String um=m.substring(1);
			String uy=y;
			 int vb;
				caculate op=new caculate();
				int tu=op.feidouhaozifutongji(um);
				int tw=op.feidouhaozifutongji(uy);
				if(tu>tw) {
					vb=tu-tw;
					for(int v=0;v<vb;v++) {
						uy="0"+uy;
						
					}
					
					
				
				}
				if(tu<tw){
					vb=tw-tu;
					for(int v=0;v<vb;v++) {
						um="0"+um;
					}
					
					
					
				}
				
				String[] m1=um.split(",");
				
				String[] y1=uy.split(",");
			
				String m2=op.StringArrayToString(m1);
				String y2=op.StringArrayToString(y1);
				
				String m3=op.divide(m2);
				String y3=op.divide(y2);
				
				
				
				
			
				
				
				
				String[] d=m3.split(",");
				Doubli_linkedCircleList a=new Doubli_linkedCircleList();
				for(int v=d.length-1;v>=0;v--) {
					a.insert(0, d[v]);
				}
				
				
				
				
			
				
				
				String[] s=y3.split(",");
				Doubli_linkedCircleList b=new Doubli_linkedCircleList();
				for(int v=s.length-1;v>=0;v--) {
					b.insert(0, s[v]);
				}
				a.display();
				b.display();
				System.out.println(op.substraction(b, a));
			
		}
		//+-
		if(!String.valueOf(m.charAt(0)).equals("-")&&String.valueOf(y.charAt(0)).equals("-")) {
			String um=m;
			String uy=y.substring(1);
			 int vb;
				caculate op=new caculate();
				int tu=op.feidouhaozifutongji(um);
				int tw=op.feidouhaozifutongji(uy);
				if(tu>tw) {
					vb=tu-tw;
					for(int v=0;v<vb;v++) {
						uy="0"+uy;
						
					}
					
					
				
				}
				if(tu<tw){
					vb=tw-tu;
					for(int v=0;v<vb;v++) {
						um="0"+um;
					}
					
					
					
				}
				
				String[] m1=um.split(",");
				
				String[] y1=uy.split(",");
			
				String m2=op.StringArrayToString(m1);
				String y2=op.StringArrayToString(y1);
				
				String m3=op.divide(m2);
				String y3=op.divide(y2);
				
				
				
				
			
				
				
				
				String[] d=m3.split(",");
				Doubli_linkedCircleList a=new Doubli_linkedCircleList();
				for(int v=d.length-1;v>=0;v--) {
					a.insert(0, d[v]);
				}
				
				
				
				
			
				
				
				String[] s=y3.split(",");
				Doubli_linkedCircleList b=new Doubli_linkedCircleList();
				for(int v=s.length-1;v>=0;v--) {
					b.insert(0, s[v]);
				}
				a.display();
				b.display();
				if(op.panduanchandu(m, y)==1) {
					
				System.out.println(op.substraction(a, b));
				}else if(op.panduanchandu(m, y)==2){
					System.out.println("-"+op.substraction(b, a));
				}else if(op.panduanchandu(m, y)==3) {
					System.out.println(op.substraction(a, b));
					
				}else if(op.panduanchandu(m, y)==4) {
					System.out.println("-"+op.substraction(b, a));
					
				}
			
		}
		if(String.valueOf(m.charAt(0)).equals("-")&&!String.valueOf(y.charAt(0)).equals("-")) {
			String um=m.substring(1);
			String uy=y;
			 int vb;
				caculate op=new caculate();
				int tu=op.feidouhaozifutongji(um);
				int tw=op.feidouhaozifutongji(uy);
				if(tu>tw) {
					vb=tu-tw;
					for(int v=0;v<vb;v++) {
						uy="0"+uy;
						
					}
					
					
				
				}
				if(tu<tw){
					vb=tw-tu;
					for(int v=0;v<vb;v++) {
						um="0"+um;
					}
					
					
					
				}
				
				String[] m1=um.split(",");
				
				String[] y1=uy.split(",");
			
				String m2=op.StringArrayToString(m1);
				String y2=op.StringArrayToString(y1);
				
				String m3=op.divide(m2);
				String y3=op.divide(y2);
				
				
				
				
			
				
				
				
				String[] d=m3.split(",");
				Doubli_linkedCircleList a=new Doubli_linkedCircleList();
				for(int v=d.length-1;v>=0;v--) {
					a.insert(0, d[v]);
				}
				
				
				
				
			
				
				
				String[] s=y3.split(",");
				Doubli_linkedCircleList b=new Doubli_linkedCircleList();
				for(int v=s.length-1;v>=0;v--) {
					b.insert(0, s[v]);
				}
				a.display();
				b.display();
				if(op.panduanchandu(m, y)==1) {
					
				System.out.println("-"+op.substraction(a, b));
				}else if(op.panduanchandu(m, y)==2){
					System.out.println(op.substraction(b, a));
				}else if(op.panduanchandu(m, y)==3) {
					System.out.println("-"+op.substraction(a, b));
					
				}else if(op.panduanchandu(m, y)==4) {
					System.out.println(op.substraction(b, a));
					
				}
			
		
		}
		

}
	public static String tiaozheng(String s) {
      //   s=s+"~~(0_0)~~";
		/*for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='0') {
			d+=d.substring(i+1);
			break;
		}
		}*/
		//int i=1;
	//	String s1=s.substring(0, 3);
		//String s3=s.substring(4,s.length());
	//	String s3=s1.replaceAll("0", replacement)
	//	String m=s.replaceAll(",", "");
		//String m1=s.replaceAll("0", "");
		//if(m1.equals("")) {
	//		return "0";
		//}
		String s1=s.replaceAll(",", "");
		int t=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='0') {
				t++;
			}
		}
		if(t==s1.length()) {
			return "0";
		}else {
		while(s.charAt(0)=='0') {
			s=s.substring(1);
			//i++;
			//i++;
		}
		
		return s;
		}
	}
	
}
