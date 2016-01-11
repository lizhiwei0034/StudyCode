package com.lzw.learn.Generic;

class Info<T> {
	private T key;

	public void setKey(T key) {
		this.key = key;
	}

	public T getKey() {
		return key;
	}

	@Override
	public String toString() {
		return this.getKey().toString();
	}
}

public class Generic02 {

	public static void main(String[] args) {
		// 实例化
		Info<String> i = new Info<String>();
		i.setKey("this is key");
		show(i);

	}

	/**
	 * 通配符的使用 即 指定参数为Info类 但是不能确定具体的类型 可以用？ 代替即： Info<?>
	 * 
	 * @param i
	 */
	public static void show(Info<?> i) {
		System.out.println(i);
	}

}
