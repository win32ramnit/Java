package org.manish.LinkedList;

import java.util.Scanner;

public class LinkedList {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Node<Integer> llist = new Node<Integer>();
		llist.head = new Node<Integer>(1);
		Node<Integer> second = new Node<Integer>(2);
		Node<Integer> third = new Node<Integer>(3);
		
		llist.head.setNext(second);
		second.setNext(third);
		
		Node<Integer> current  = llist.getHead();
		while(null != current) {
			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
		
		sc.close();
	}
	
}
