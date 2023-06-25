package com.practice;

public class SelectionSort {
	
	void sort(int arr[])
	{
		int len=arr.length;
		//System.out.println(arr.length);
		for(int i=0;i<len-1;i++)
		{	
			int min=i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
					
				}
				
			}
			int tmp = arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
			
			
		}
	}
	
	void printStack(int arr[])
	{
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
	}
	 public static void main(String[] args)
	 {
		 SelectionSort n =new SelectionSort();
		 int arr[]= {3,5,1,7,4};
		 n.sort(arr);
		 System.out.println("Sorted Array");
		 n.printStack(arr);
	 }
}
