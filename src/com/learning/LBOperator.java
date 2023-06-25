package com.learning;
import java.util.*;
import java.lang.String;
public class LBOperator {

	public static void main(String[] args) {
		int m1=10;
		int m2 =5;
		int m3 =20;
		System.out.println(m1<m2 && m1++ <m3);
		System.out.println(m1);
		System.out.println(m1<m2 & m1++ <m3);
		System.out.println(m1);
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a interegr value");
		int v =s.nextInt();
		char c =(char) v;
		System.out.println("Value of c is" +" "+ c);
		
		String a= new String("Welcome");
		System.out.println(a.charAt(3));

	}

}
