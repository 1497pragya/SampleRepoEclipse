package com.practice;
//import java.util.LinkedList;
public class LinkedList {
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d)
		{
			this.data=d;
			next=null;
		}
	}
	
	public void printstack()
	{
		Node n =head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void count()
	{	int count=0;
		Node y=head;
		while(y!=null)
		{	count++;
			y=y.next;
		}
		System.out.println();
		System.out.println(count);
	}
	
	public void push(int newdata)
	{
		Node node=new Node(newdata);
		node.next=head;
		head=node;
		System.out.println();
	}
	
	public void insertAfter(Node prevNode, int newdata) {
		if(prevNode==null)
		{
			return;
		}
		Node newdat=new Node(newdata);
		newdat.next=prevNode.next;
		prevNode.next=newdat;
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList();
		l.head=new Node(1);
		Node second =new Node(2);
		Node third=new Node(3);
		l.head.next=second;
		second.next=third;
		l.printstack();
		l.push(5);
		l.printstack();
		l.insertAfter(l.head.next,6);
		l.printstack();
		l.count();
	}

}
