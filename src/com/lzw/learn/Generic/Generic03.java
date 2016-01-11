package com.lzw.learn.Generic;
/**
 * 定义一个泛型接口
 * @author 志伟
 *
 * @param <T>
 */
interface GenInfo<T>{
	
	public void tell();
}
/**
 * 定义一个子类 实现接口，并重写接口中定义的方法
 * @author 志伟
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
		//实例化Genson类 并只类型
		Genson<Integer> g=new Genson<Integer>();
		g.setStr(222);
		g.tell();
	}
}
