package Num21;
import java.math.BigInteger;
import java.util.*;

public class test {

	public static void main(String[] args) {
		System.out.println("�������30000������������");
		int [] arr=new int[30000];
		Random r=new Random();
		for(int i=0;i<30000;i++) {
			arr[i]=r.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		Sort s=new Sort();
		
	
		s.bubbleSort(arr);
		/*long end1=System.currentTimeMillis();
		System.out.println("ð�������ʱ"+(end1-start1)+"����");*/
		
		//long start2=System.currentTimeMillis();
		s.shellSort(arr);
		//long end2=System.currentTimeMillis();
		//System.out.println("ϣ�������ʱ"+(end2-start2)+"����");
		
	//long start3=System.currentTimeMillis();
	//System.out.println(start3);
		s.insertSort(arr);
		//long end3=System.currentTimeMillis();
	//	System.out.println(end3);
		//System.out.println("ֱ�Ӳ��������ʱ"+(end3-start3)+"����");
		
		long start4=System.currentTimeMillis();
		
		s.quickSort(arr, 0, 29999);
		long end4=System.currentTimeMillis();
		System.out.println("���������ʱ"+(end4-start4)+"����");
		
		
		s.selectionSort(arr);
		s.heapSort(arr);
		long start5=System.currentTimeMillis();
		s.mergeSort(arr, 0, 29999);
		long end5=System.currentTimeMillis();
		System.out.println("�鲢�����ʱ"+(end5-start5)+"����");
		
		//long end4=System.currentTimeMillis();
		//System.out.println("���������ʱ"+(end4-start4)+"����");
		

		// TODO Auto-generated method stub

	}

}
