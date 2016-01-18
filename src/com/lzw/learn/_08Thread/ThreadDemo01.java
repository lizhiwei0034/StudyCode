package com.lzw.learn._08Thread;

public class ThreadDemo01 {
	/**
	 * 通过Thread来实现多线程
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 方法一： 通过Thread类来实现
		 */
		// 实例化两个线程
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		// 通过类调用其中的方法:有先后顺序的
		mt1.run();
		mt2.run();
		// 这里线程的启动时通过Start()来执行的：两者同时争夺资源来执行。
		mt1.start();
		mt2.start();
		/**
		 * 方法二：通过Runnable接口来实现
		 */
		// 实例化两个MyRunnable
		MyRunnable mr1 = new MyRunnable("A");
		MyRunnable mr2 = new MyRunnable("B");
		// 实例化一个线程
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		// 启动线程
		t1.start();
		t2.start();
	}
}
