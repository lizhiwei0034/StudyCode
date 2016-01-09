package com.lzw.learn.Generic;

/**
 * �෺�͵�ʹ��
 * 
 * @author ־ΰ
 *
 * @param <T>����һ
 *            integer����
 * @param <K>���Ͷ�
 *            String ����
 */
class GenericDemo<T, K> {
	private T name;
	private K age;

	public void setAge(K age) {
		this.age = age;
	}

	public K getAge() {
		return age;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getName() {
		return name;
	}

	public void show() {
		System.out.println("age:" + getAge() + " name:" + getName());

	}
}

public class Generic01 {

	public static void main(String[] args) {
		// ʵ����GenericDemo��
		GenericDemo<String, Integer> g = new GenericDemo<String, Integer>();
		g.setAge(10);
		g.setName("lizhiei");
		g.show();
	}

}
