	package com.lzw.learn._08Thread;
	/**
	 * 定义一个子类 并继承Thread类
	 * @author mysti_000
	 *
	 */
	public class MyThread extends Thread {
		private String name;
	
		// 定义一个构造函数
		public MyThread(String name) {
			this.name = name;
		}
	
		// 重写run方法
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println(name + ":" + i);
			}
			super.run();
		}
	
	}
