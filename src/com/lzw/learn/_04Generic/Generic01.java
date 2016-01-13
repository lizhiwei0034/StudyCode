package com.lzw.learn._04Generic;

/**
 * 多泛型的使用
 * 
 * @author 志伟lzw
 *
 * @param <T>泛型�?
 *            integer类型
 * @param <K>泛型�?
 *            String 类型
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
		// 实例化GenericDemo�?
		GenericDemo<String, Integer> g = new GenericDemo<String, Integer>();
		g.setAge(10);
		g.setName("lizhiei");
		g.show();
	}

}
