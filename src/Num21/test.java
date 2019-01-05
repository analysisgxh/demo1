package Num21;
import java.math.BigInteger;
import java.util.*;

public class test {

	public static void main(String[] args) {
		System.out.println("Ëæ»ú²úÉú30000¸öÊı½øĞĞÅÅĞò");
		int [] arr=new int[30000];
		Random r=new Random();
		for(int i=0;i<30000;i++) {
			arr[i]=r.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		Sort s=new Sort();
		
	
		s.bubbleSort(arr);
		/*long end1=System.currentTimeMillis();
		System.out.println("Ã°ÅİÅÅĞòºÄÊ±"+(end1-start1)+"ºÁÃë");*/
		
		//long start2=System.currentTimeMillis();
		s.shellSort(arr);
		//long end2=System.currentTimeMillis();
		//System.out.println("Ï£¶ûÅÅĞòºÄÊ±"+(end2-start2)+"ºÁÃë");
		
	//long start3=System.currentTimeMillis();
	//System.out.println(start3);
		s.insertSort(arr);
		//long end3=System.currentTimeMillis();
	//	System.out.println(end3);
		//System.out.println("Ö±½Ó²åÈëÅÅĞòºÄÊ±"+(end3-start3)+"ºÁÃë");
		
		long start4=System.currentTimeMillis();
		
		s.quickSort(arr, 0, 29999);
		long end4=System.currentTimeMillis();
		System.out.println("¿ìËÙÅÅĞòºÄÊ±"+(end4-start4)+"ºÁÃë");
		
		
		s.selectionSort(arr);
		s.heapSort(arr);
		long start5=System.currentTimeMillis();
		s.mergeSort(arr, 0, 29999);
		long end5=System.currentTimeMillis();
		System.out.println("¹é²¢ÅÅĞòºÄÊ±"+(end5-start5)+"ºÁÃë");
		
		//long end4=System.currentTimeMillis();
		//System.out.println("¿ìËÙÅÅĞòºÄÊ±"+(end4-start4)+"ºÁÃë");
		

		// TODO Auto-generated method stub

	}

}
