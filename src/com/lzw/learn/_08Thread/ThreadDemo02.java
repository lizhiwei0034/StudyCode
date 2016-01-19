package com.lzw.learn._08Thread;

//创建个类 实现Runnable接口
class RunnableClass implements Runnable{
 	
	//重写run方法
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				//Thread的常用方法1：获取当前线程对象  Thread.currentThread()
				//Thread的常用方法2:获取当前线程的名称Thread.currentThread().getName()
				//Thread的常用方法3:线程休眠(单位毫秒)
				Thread.sleep(1000);
				System.out.println("t1线程 "+i+" 当前Thread对象为："+Thread.currentThread()+" 当前线程的名称为："+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadDemo02 {
	
	public static void main(String[] args) {
		//实例化一个线程接口的实现类
		RunnableClass rc1=new RunnableClass();
		Thread t1=new Thread(rc1,"A");	
		t1.start();
		//Thread的常用方法4：强制执行某一个线程
		for (int i = 0; i < 50; i++) {
			if(i>10){
				
				try {
					//当i>0的时候 强制执行t1线程
					t1.join();					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("这里是主线程"+i);
		}
 
		
		
	}

}
