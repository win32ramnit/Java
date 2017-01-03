package org.manish.LinkedList;

public class Node<T> {
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public Node() {
		
	}
	Node<T> head = null;
	
	public Node<T> getHead() {
		return this.head;
	}
}
