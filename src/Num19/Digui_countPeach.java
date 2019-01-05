package Num19;
import java.util.*;

public class Digui_countPeach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("桃子总数为"+countPeach(1));
	}
	public static int countPeach(int day) {
		if(day==10) {
			return 1;
		}else {
			return 2*countPeach(day+1)+2;
		}
	}

}
