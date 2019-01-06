package Num24;

public class caculate {
	boolean is=false;//不进位
	boolean isi=false;
public String add(Doubli_linkedCircleList a,Doubli_linkedCircleList b)throws Exception {
/*	Doubli_linkedCircleList q=new Doubli_linkedCircleList();
	int l;
	if(a.length()>=b.length()) {
		l=a.length();
	}else {
		l=b.length();
	}
	for(int i=0;i<l;i++) {
		q.insert(0, 0);
	}*/
	LinkStack s=new LinkStack();
	//int short=a.length()?b.length():
	DuLNode p=a.getHead();
	DuLNode p1=b.getHead();
	while(p.prior!=a.getHead()&&p1.prior!=b.getHead()) {

	int m=Integer.parseInt((p.prior.data).toString());
	//System.out.println(m);
	int n=Integer.parseInt((p1.prior.data).toString());
	int c=m+n;
	if(is) {
		c++;
		is=false;
	}
	
			if (c < 10000) {
			/*	if (is) {
					c = c + 1;
					if (c > 10000) {
						c -= 10000;
						// is=true;

						s.push(c);
						is = true;
					} else {
						s.push(c);
						is = false;
					}
				s.push(c);

				} else {
					c -= 10000;
					s.push(c);
					is = true;

				}*/
				s.push(c);

			} else {
				is = true;

				c -= 10000;
				s.push(c);

			}
	p=p.prior;
	p1=p1.prior;
}
	
	String e="";
	while(!s.isEmpty()) {
		String w=String.valueOf((int)s.pop());
		if(w.length()==1) {
			w="000"+w;
			
		}
		if(w.length()==2) {
			w="00"+w;
			
		}	
		if(w.length()==3) {
			w="0"+w;
			
		}
		e+=w;
	}
	int a1=Integer.parseInt(a.getHead().next.data.toString());
	int b1=Integer.parseInt(b.getHead().next.data.toString());
	int c1=a1+b1;
	if(c1>10000) {
		e="1"+e;
	}
	/*int yu=0;
	for(int i=0;i<e.length();i++) {
		if(String.valueOf(e.charAt(i)).equals("0")&&!String.valueOf(e.charAt(1+i)).equals("0")){
			yu=i+1;
			break;
			
		}
	}
	e=e.substring(0);*/
	return divide(e);
			//+"........."+e;
	
}
public String divide(String s) {
	LinkStack a=new LinkStack();
	LinkStack b=new LinkStack();
	for(int i=0;i<s.length();i++) {
		a.push(s.charAt(i));
	}

		
	for(int i=1;i<=s.length();i++) {
		 b.push(a.pop());
		 if(i%4==0) {
			 b.push(',');
		 }
		 //String h=String.valueOf(t);
		 
	}
	//System.out.println("@@@@@@@@@@@@");
	//b.display();
	//System.out.println("@@@@@@@@@@@@");
	String z="";
	while(!b.isEmpty()) {
		z+=String.valueOf((char)b.pop());
		
	}
	if(String.valueOf(z.charAt(0)).equals(",")) {
		z=z.substring(1);
	}
	return z;
}
public String StringArrayToString(String[] s) {
	String t="";
	for(int i=0;i<s.length;i++) {
		t+=s[i];
		
	}
	return t;
	
	
}
public int feidouhaozifutongji(String  s) {
	int u=0;

	for(int i=0;i<s.length();i++) {
	if(!String.valueOf(s.charAt(i)).equals(",")) {
		u++;
	}
		
	}
	return u;
}
public String substraction(Doubli_linkedCircleList a,Doubli_linkedCircleList b) {
	DuLNode p=a.getHead();
	DuLNode p1=b.getHead();
	LinkStack s1=new LinkStack();
	while(p.prior!=a.getHead()&&p1.prior!=b.getHead()) {

	int m=Integer.parseInt((p.prior.data).toString());
	//System.out.println(m);
	int n=Integer.parseInt((p1.prior.data).toString());
	int c=m-n;
	if(isi) {
		c--;
		isi=false;
	}
	
			if (c >0) {
			/*	if (is) {
					c = c + 1;
					if (c > 10000) {
						c -= 10000;
						// is=true;

						s.push(c);
						is = true;
					} else {
						s.push(c);
						is = false;
					}
				s.push(c);

				} else {
					c -= 10000;
					s.push(c);
					is = true;

				}*/
				s1.push(c);

			} else {
				isi = true;

				c += 10000;
				s1.push(c);

			}
	p=p.prior;
	p1=p1.prior;
}

	String e="";
	while(!s1.isEmpty()) {
		String w=String.valueOf((int)s1.pop());
		if(w.length()==1) {
			w="000"+w;
			
		}
		if(w.length()==2) {
			w="00"+w;
			
		}	
		if(w.length()==3) {
			w="0"+w;
			
		}
		e+=w;
	}
	return divide(e);
	
	
}
public int panduanchandu(String m,String y) {
	String m1=m.replaceAll("[^\\d]", "");
	String y1=y.replaceAll("[^\\d]", "");//使用正则替换非数字字符;
	
	if( m1.length()>y1.length()) {
		return 1;
	}else if(m1.length()==y1.length()) {
		if(changduxiandeng(m1, y1)) {
			return 3;
		}else{
			return 4;
		}
	}else {
		return 2;
	}
}
public boolean changduxiandeng(String m1,String y1) {
	for(int v=0;v<m1.length();v++) {
		if(m1.charAt(v)>y1.charAt(v)) {
			return true;
		}else if(m1.charAt(v)<y1.charAt(v)){
			return false;
		}else {
			continue;
		}
	}
	return true;
}
}
