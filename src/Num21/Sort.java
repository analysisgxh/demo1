package Num21;

import java.util.Arrays;

public class Sort {
	//√∞≈›≈≈–Ú
	public  void bubbleSort(int[] lst)
	  {
		long start1=System.currentTimeMillis();
	    int n = lst.length;
	    boolean swapped;
	    do
	    {
	      swapped = false;
	      for (int i = 0; i < n - 1; i++) {
	        if (lst[i] > lst[(i + 1)])
	        {
	          int temp = lst[i];
	          lst[i] = lst[(i + 1)];
	          lst[(i + 1)] = temp;
	          swapped = true;
	        }
	      }
	    } while (swapped);
	    long end1=System.currentTimeMillis();
		System.out.println("√∞≈›≈≈–Ú∫ƒ ±"+(end1-start1)+"∫¡√Î");
	  }
	//∂—≈≈–Ú
	public  void heapSort(int[] arr)
	  {
		long start2=System.currentTimeMillis();
	    int n = arr.length;
	    for (int i = n / 2 - 1; i >= 0; i--) {
	      heapify(arr, n, i);
	    }
	    for (int i = n - 1; i >= 0; i--)
	    {
	      int temp = arr[0];
	      arr[0] = arr[i];
	      arr[i] = temp;
	      

	      heapify(arr, i, 0);
	    }
	    long end2=System.currentTimeMillis();
		System.out.println("∂—≈≈–Ú∫ƒ ±"+(end2-start2)+"∫¡√Î");
	  }
	  
	  private  void heapify(int[] arr, int n, int i)
	  {
	    int largest = i;
	    int l = 2 * i + 1;
	    int r = 2 * i + 2;
	    if ((l < n) && (arr[l] > arr[largest])) {
	      largest = l;
	    }
	    if ((r < n) && (arr[r] > arr[largest])) {
	      largest = r;
	    }
	    if (largest != i)
	    {
	      int swap = arr[i];
	      arr[i] = arr[largest];
	      arr[largest] = swap;
	      

	      heapify(arr, n, largest);
	    }
	  }
	  private  void merge(int[] arr, int l, int m, int r)
	  {
	    int n1 = m - l + 1;
	    int n2 = r - m;
	    

	    int[] L = new int[n1];
	    int[] R = new int[n2];
	    for (int i = 0; i < n1; i++) {
	      L[i] = arr[(l + i)];
	    }
	    for (int j = 0; j < n2; j++) {
	      R[j] = arr[(m + 1 + j)];
	    }
	    int i = 0;int j = 0;
	    

	    int k = l;
	    do
	    {
	      if (L[i] <= R[j])
	      {
	        arr[k] = L[i];
	        i++;
	      }
	      else
	      {
	        arr[k] = R[j];
	        j++;
	      }
	      k++;
	      if (i >= n1) {
	        break;
	      }
	    } while (j < n2);
	    while (i < n1)
	    {
	      arr[k] = L[i];
	      i++;
	      k++;
	    }
	    while (j < n2)
	    {
	      arr[k] = R[j];
	      j++;
	      k++;
	    }
	  }
	  //πÈ≤¢≈≈–Ú
	  public  void mergeSort(int[] arr, int l, int r)
	  {
			long start3=System.currentTimeMillis();
	    if (l < r)
	    {
	      int m = (l + r) / 2;
	      

	      mergeSort(arr, l, m);
	      mergeSort(arr, m + 1, r);
	      

	      merge(arr, l, m, r);
	    }
	    long end3=System.currentTimeMillis();
		//System.out.println("πÈ≤¢≈≈–Ú∫ƒ ±"+(end3-start3)+"∫¡√Î");
		//System.out.println(arr.length);
	  }
	  //øÏÀŸ≈≈–Ú
	  public  void quickSort(int[] arr, int low, int high)
	  {
			long start4=System.currentTimeMillis();
	    if (low < high)
	    {
	      int pi = partition(arr, low, high);
	      


	      quickSort(arr, low, pi - 1);
	      quickSort(arr, pi + 1, high);
	    }
	    long end4=System.currentTimeMillis();
		//System.out.println("øÏÀŸ≈≈–Ú∫ƒ ±"+(end4-start4)+"∫¡√Î");
	  }
	  private  int partition(int[] arr, int low, int high)
	  {
	    int pivot = arr[high];
	    int i = low - 1;
	    for (int j = low; j < high; j++) {
	      if (arr[j] <= pivot)
	      {
	        i++;
	        

	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	      }
	    }
	    int temp = arr[(i + 1)];
	    arr[(i + 1)] = arr[high];
	    arr[high] = temp;
	    
	    return i + 1;
	  }
	  //—°‘Ò≈≈–Ú
	  public  void selectionSort(int[] arr)
	  {
			long start5=System.currentTimeMillis();
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++)
	    {
	      int min_idx = i;
	      for (int j = i + 1; j < n; j++) {
	        if (arr[j] < arr[min_idx]) {
	          min_idx = j;
	        }
	      }
	      int temp = arr[min_idx];
	      arr[min_idx] = arr[i];
	      arr[i] = temp;
	    }
	    long end5=System.currentTimeMillis();
		System.out.println("—°‘Ò≈≈–Ú∫ƒ ±"+(end5-start5)+"∫¡√Î");
	  }
	  //œ£∂˚≈≈–Ú 
	  public void shellSort(int[] r) {  
			long start6=System.currentTimeMillis();
		  int[] d=new int[29999];
		  for(int i=28888;i>=0;i--) {
			  d[i]=(int)Math.pow(2, i+1)-1;
		  }
		  
		  int temp;
		  int i,j;
		  for(int k=0;k<d.length;k++) {
			  int dk=d[k];
			  for(i=dk;i<r.length;i++) {
				  temp=r[i];
				  for(j=i-dk;j>=0&&temp<r[j];j-=dk) {
					  r[j+dk]=r[j];
				  }
				  r[j+dk]=temp;
			  }
		  }
		  long end6=System.currentTimeMillis();
			System.out.println("œ£∂˚≈≈–Ú∫ƒ ±"+(end6-start6)+"∫¡√Î");
		  
	  }
	  //÷±Ω”≤Â»Î≈≈–Ú
	  public void insertSort(int r[]) {
			long start7=System.currentTimeMillis();
		  int temp;
		  int i,j;
		  for(i=1;i<r.length;i++) {
			  temp=r[i];
			  for(j=i-1;j>=0&&temp<r[j];j--) {
				  r[j+1]=r[j];
			  }
			  r[j+1]=temp;
		  }
		 // System.out.println(Arrays.toString(r));
		  long end7=System.currentTimeMillis();
			System.out.println("≤Â»Î≈≈–Ú∫ƒ ±"+(end7-start7)+"∫¡√Î");
	  }
	}


