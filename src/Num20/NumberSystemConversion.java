package Num20;

public class NumberSystemConversion {
	//十进制传过来转成2进制；
	public String convertTen_to_Two(int m) {
		LinkStack s=new LinkStack();
		while(m>0) {
			s.push(m%2);
			m=m/2;
		}
		String str="";
		while(!s.isEmpty()) {
			str+=(Integer)s.pop();
			
		}
		return str;
		
		
	}
	public String convertTen_Eeight(int m) {
		return convertTwo_Eeight(convertTen_to_Two(m));
		
	}
	public String convertTen_Sixteen(int m) {
		return convertTwo_Sixteen(convertTen_to_Two(m));
	}
	//传过来2进制字符串转10进制
	public int convertTwo_Ten(String s) {
		LinkStack ls=new LinkStack();
		for(int i=0;i<s.length();i++) {
			ls.push(s.charAt(i));
		}
		int sum=0;
		int i=0;
		while(!ls.isEmpty()) {
			sum=sum+Integer.parseInt(String.valueOf((char)ls.pop()))*(int)Math.pow(2, i);
			i++;
		}
		
		return sum;
	}
	//传过来2进制字符串转8进制
	public String convertTwo_Eeight(String s) {
		
		int l=s.length();
		if(l%3!=0) {
			if(l%3==2) {
				s="0"+s;
			
		}
			if(l%3==1) {
				s="00"+s;
			}
			
		}
		l=s.length();
		//System.out.println(s+"长度"+l);
		LinkStack ls=new LinkStack();
		LinkStack a=new LinkStack();
		for(int i=0;i<s.length();i++) {
			ls.push(s.charAt(i));
		}
		ls.display();
		System.out.println("length"+ls.length());
	
	
		for(int i=0;i<(s.length()/3);i++) {
			String c="";
			String r="";
			for(int j=0;j<3;j++) {
				
				c+=String.valueOf((char)ls.pop());
				
				//r+=turn(c);
				
			}
			System.out.println(c);
			r+=turn(c);
			a.push(String.valueOf(convertTwo_Ten(r)));
			
		}
		
		/*	while(!ls.isEmpty()) {
			String c="";
			for(int i=0;i<3;i++) {
				c+=String.valueOf((char)ls.pop());
			}
			a.push(String.valueOf(convertTwo_Ten(c)));
			
		}*/
		String k="";
		//a.display();
		while(!a.isEmpty()) {
			k+=(String)a.pop();
			
		}
		return k;
		
		
		
	}
	public String turn(String s) {
			String k="";
			for(int i=s.length()-1;i>=0;i--) {
				k+=s.charAt(i);
			}
			return k;
	}
	//传过来2进制字符串转16进制
	public String convertTwo_Sixteen(String s) {
		int l=s.length();
		if(l%4!=0) {
			if(l%4==3) {
				s="0"+s;
			
		}
			if(l%4==2) {
				s="00"+s;
			}
			if(l%4==1) {
				s="000"+s;
			}
			
		}
		LinkStack b=new LinkStack();
		LinkStack p=new LinkStack();
		for(int i=0;i<s.length();i++) {
			b.push(s.charAt(i));
		}

		for(int i=0;i<s.length()/4;i++) {
			String c="";
			String r="";
			for(int j=0;j<4;j++) {
				
				c+=String.valueOf((char)b.pop());
				
				//r+=turn(c);
				
			}
			System.out.println(c);
			r+=turn(c);
			System.out.println("@"+r);
			p.push(String.valueOf(convertTwo_Ten(r)));
			
	
		}
		p.display();
		/*while(!b.isEmpty()) {
			String c="";
			for(int i=0;i<4;i++) {
				c+=String.valueOf((char)b.pop());
			}
			p.push(String.valueOf(convertTwo_Ten(c)));
			
		}*/
		String k="";
		while(!p.isEmpty()) {
			String f=(String)p.pop();
			if(f.equals("10")) {
				k+="A";
			}else if(f.equals("11")) {
				k+="B";
			}else if(f.equals("12")) {
				k+="C";
			}else if(f.equals("13")) {
				k+="D";
			}else if(f.equals("14")) {
				k+="E";
			}else if(f.equals("15")) {
				k+="F";
			}else{k+=f;}
			
			
			
			
			
		
			
		}
		return k;
		
		
	}
	//八进制字符串转2进制
	public String convertEeight_Two(String s) {
		LinkStack a=new LinkStack();
		LinkStack b=new LinkStack();
			for(int i=0;i<s.length();i++) {
				a.push(s.charAt(i));
			}
			while(!a.isEmpty()) {
				
			String str=convertTen_to_Two(Integer.parseInt(String.valueOf((char)a.pop())));
			if(str.length()%3!=0) {
				if(str.length()%3==2) {
					str="0"+str;
				}
				if(str.length()%3==1) {
					str="00"+str;
				}
			}
			b.push(str);
			
			
		}
			String v="";
			while(!b.isEmpty()) {
				v+=(String)b.pop();
			}
			return v;
	}
	//八进制转16进制
	public String convertEeight_Sixteen(String s) {
		return convertTwo_Sixteen(convertEeight_Two(s));
	}
	//八进制转10进制
	public int convertEeight_Ten(String s) {
		return convertTwo_Ten(convertEeight_Two(s));
		
	}
	//16进制转2进制
	public String convertSixteen_Two(String s) {
		LinkStack a=new LinkStack();
		LinkStack b=new LinkStack();
		for(int i=0;i<s.length();i++) {
			a.push(s.charAt(i));
		}
		while(!a.isEmpty()) {
			char c=(char)a.pop();
			String str=String.valueOf(c);
			if(str.equals("A")) {
			str="10";
			
			
			}else if(str.equals("B")) {
			str="11";
			}else if(str.equals("C")) {
				str="12";
			}else if(str.equals("D")) {
				str="13";
			}else if(str.equals("E")) {
				str="14";
			}else if(str.equals("F")) {
				str="15";
			}
			String d=(convertTen_to_Two(Integer.parseInt(str)));
			if(d.length()%4!=0) {
				if(d.length()%4==3) {
					d="0"+d;
				}
				if(d.length()%4==2) {
					d="00"+d;
				}
				if(d.length()%4==1) {
					d="000"+d;
				}
				
			}
			b.push(d);
			
		}
		String l="";
		while(!b.isEmpty()) {
			l+=(String)b.pop();
			
		}
		return l;
		
	}
	public String convertSixteen_Eeight(String s) {
		return convertTwo_Eeight(convertSixteen_Two(s));
	}
	public int convertSixteen_Ten(String s) {
		return convertTwo_Ten(convertSixteen_Two(s));
	}

	}
