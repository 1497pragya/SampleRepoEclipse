package com.practice;

import java.util.Stack;

public class StackTraversal {
	static void printStack(Stack<Integer> St) {
		while(!(St.isEmpty()))
		{
		
			System.out.println(St.peek());
			St.pop();
		}
	}
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		
		printStack(st);
		

	}

}
