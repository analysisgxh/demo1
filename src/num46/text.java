package num46;
import java.util.*;

public class text {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
	//	System.out.println("请输入总人数n和报数值k");
		ShanYu s=new ShanYu();
		s.result();
		System.out.println("输入true继续或者输入false停止");
		
		while(sc.nextBoolean()) {
			s.result();
		}
		// TODO Auto-generated method stub

	}

}
