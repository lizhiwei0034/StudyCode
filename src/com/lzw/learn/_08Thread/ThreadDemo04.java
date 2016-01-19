package com.lzw.learn._08Thread;

class ticket implements Runnable {
	// 定义5张票
	private int tic = 5;
	
	//重写run方法实现买票过程
	@Override
	public void run() {
		//实现同步：
		synchronized (this) {//这里面放同步的代码
			//假设买了10次吧
			for (int i = 0; i < 10; i++) {
				if(tic>0){
					//延迟1秒钟
					try {
						Thread.sleep(1000);
						System.out.println("出票："+tic--); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
				}
			}
		}
		
	}
}

public class ThreadDemo04 {

	public static void main(String[] args) {
		//实例化一个车站
		ticket station=	new ticket();
		//创建3个窗口 t1  t2  t3
		Thread t1=new Thread(station,"T1");
		Thread t2=new Thread(station,"T2");
		Thread t3=new Thread(station,"T2");
		//三个窗口同时买票
		t1.start();
		t2.start();
		t3.start();

	}

}
