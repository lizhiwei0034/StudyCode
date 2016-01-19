package com.lzw.learn._08Thread;

//创建个类 实现Runnable接口
class RunClass implements Runnable {

	// 重写run方法
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo03 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunClass(), "A");
		Thread t2 = new Thread(new RunClass(), "B");
		Thread t3 = new Thread(new RunClass(), "C");
		//设置3个优先级
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
