package com.lzw.learn.Generic;
/**
 * ����һ�����ͽӿ�
 * @author ־ΰ
 *
 * @param <T>
 */
interface GenInfo<T>{
	
	public void tell();
}
/**
 * ����һ������ ʵ�ֽӿڣ�����д�ӿ��ж���ķ���
 * @author ־ΰ
 *
 * @param <T>
 */
class Genson<T> implements GenInfo<T>{
	private T str;
	public void setStr(T str) {
		this.str = str;
	}
	public T getStr() {
		return str;
	}
	@Override
	public void tell() {		
		System.out.println(getStr());
	}
}
public class Generic03 {
	
	public static void main(String[] args) {
		//ʵ����Genson�� ��ֻ����
		Genson<Integer> g=new Genson<Integer>();
		g.setStr(222);
		g.tell();
	}
}
