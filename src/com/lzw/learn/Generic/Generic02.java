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
		// ʵ����
		Info<String> i = new Info<String>();
		i.setKey("this is key");
		show(i);

	}

	/**
	 * ͨ�����ʹ�� �� ָ������ΪInfo�� ���ǲ���ȷ����������� �����ã� ���漴�� Info<?>
	 * 
	 * @param i
	 */
	public static void show(Info<?> i) {
		System.out.println(i);
	}

}
