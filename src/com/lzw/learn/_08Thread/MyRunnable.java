package com.lzw.learn._08Thread;

/**
 * 通过实现Runnable接口来实现多线程
 * 
 * @param args
 */
public class MyRunnable implements Runnable {
	//定义属性
	private String name;
	//构造方法
	public MyRunnable(String name) {
	this.name=name;	
	}
	//实现接口中的抽象方法
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
}
