package com.linear;


public class ArrayList {
	private int size;
	private int[] elements;
	private static final int DEFAULT_CAPACITY = 10;
	private static final int ELEMENT_NOT_FOUND = -1;
	public ArrayList(int capacity) {
		capacity = capacity < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : capacity;
		elements = new int[capacity];
	}
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	
	public int size() {
		return size;// 元素的数量
	}
	public boolean isEmpty() {
		return size == 0;// 是否为空
	}
	public boolean contains(int element) {
		// 是否包含某个元素
		if (indexOf(element) != ELEMENT_NOT_FOUND) return true;
		return false;
	}
	
	public void add(int element) {
		// 添加元素到最后面
//		if (size >= elements.length) {
//			
//		}
		elements[size ++] = element;
	}
	public int get(int index) {
		// 返回index位置对应的元素
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: "+index+"  Size:"+size);
		}
		return elements[index];
	}
	/**
	 * 
	 * @param index
	 * @param element
	 * @return 返回之前的那个元素
	 */
	public int set(int index, int element) {
		// 设置index位置的元素
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: "+index+"  Size:"+size);
		}
		int old = elements[index];
		elements[index] = element;
		return old;
	}
//	public void add(int index, int element); // 往index位置添加元素
//	public int remove(int index); // 删除index位置对应的元素
	public int indexOf(int element) {
		// 查看元素的位置
		for (int i = 0; i < size; i++) {
			if (elements[i] == element) return i;
		}
		return ELEMENT_NOT_FOUND;
	}
	public void clear() {
		// 清除所有元素
		size = 0;
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("size=").append(size).append(",[");
		for (int i = 0; i < size; i ++)
		{
			if (i != 0) {
				string.append(",");
			}
			string.append(elements[i]);
			
		}
		string.append("]");
		return string.toString();
	}

}
