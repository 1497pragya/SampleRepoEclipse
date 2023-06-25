package com.practice;

public class BubbleSort {
	public void sort(int arr[])
	{	boolean swap=false;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
				
				
			}
			if(swap==false)
			{
				break;
			}
		}
	}
	
	void print(int arr[])
	{
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort n=new BubbleSort();
		int arr[]= {3,6,2,5,7};
		n.sort(arr);
		n.print(arr);
		
	}

}
