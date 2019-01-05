package Num19;

public class Array_countPeach {

	public static void main(String[] args) {
		int[] c=new int[10];
		c[9]=1;
		for(int i=8;i>=0;i--) {
			c[i]=2*c[i+1]+2;
		}
		System.out.println("桃子总数为"+c[0]);
		// TODO Auto-generated method stub

	}

}
