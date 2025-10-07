package resources;

import java.util.*;

public class Node<E> {
	// List related fields
	private E data;
	private Node<E> next; // singly linked list

	// Tree related fields
	private Node<E> parent; // parent node for tree
	private List<Node<E>> children = new ArrayList<>(); // children for tree

	// ===== Constructors =====

	// For linked list usage
	public Node(E data) {
		this.data = data;
		this.next = null;
	}

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	// For tree usage
	public Node() {
	}

	public Node(Node<E> parent) {
		this.parent = parent;
	}

	public Node(Node<E> parent, E data) {
		this.parent = parent;
		this.data = data;
	}

	// ===== Linked List Methods =====
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	// ===== Tree Methods =====
	public Node<E> getParent() {
		return this.parent;
	}

	public void setParent(Node<E> parent) {
		this.parent = parent;
	}

	public boolean isRoot() {
		return this.parent == null;
	}

	public boolean hasChildren() {
		return !this.children.isEmpty();
	}

	public void addChild(Node<E> child) {
		child.setParent(this);
		children.add(child);
	}

	public void removeChild(Node<E> child) {
		child.setParent(null);
		children.remove(child);
	}

	@SuppressWarnings("unchecked")
	public Node<E>[] children() {
		return (Node<E>[]) children.toArray(new Node[children.size()]);
	}

	// 'item' methods for tree context: alias to data
	public void setItem(E item) {
		this.data = item;
	}

	public E getItem() {
		return this.data;
	}
}