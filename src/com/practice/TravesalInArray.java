package com.practice;

public class TravesalInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		for (int i=0;i<n;i++)
		{
			System.out.println("the elements in the array are "+arr[i]);
		}
		StringBuffer s=new StringBuffer("Pragya");
		s.append(" "); 
		s.append("Jain");
		System.out.println(s);
		StringBuffer s4=new StringBuffer("Pragya");
		
		String s1=new String("Pragya");
		s1.concat(" "); 
		String s5=s1.concat("idhg");
		System.out.println(s5);
		s1.concat("Jain");
		System.out.println(s1);
		String s2=new String("Pragya");
		if(s.equals(s4))
		{
			System.out.println("Hi");
		}
	}

}
