package com.lzw.learn._08Thread;

//�������� ʵ��Runnable�ӿ�
class RunnableClass implements Runnable{
 	
	//��дrun����
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				//Thread�ĳ��÷���1����ȡ��ǰ�̶߳���  Thread.currentThread()
				//Thread�ĳ��÷���2:��ȡ��ǰ�̵߳�����Thread.currentThread().getName()
				//Thread�ĳ��÷���3:�߳�����(��λ����)
				Thread.sleep(1000);
				System.out.println("t1�߳� "+i+" ��ǰThread����Ϊ��"+Thread.currentThread()+" ��ǰ�̵߳�����Ϊ��"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadDemo02 {
	
	public static void main(String[] args) {
		//ʵ����һ���߳̽ӿڵ�ʵ����
		RunnableClass rc1=new RunnableClass();
		Thread t1=new Thread(rc1,"A");	
		t1.start();
		//Thread�ĳ��÷���4��ǿ��ִ��ĳһ���߳�
		for (int i = 0; i < 50; i++) {
			if(i>10){
				
				try {
					//��i>0��ʱ�� ǿ��ִ��t1�߳�
					t1.join();					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("���������߳�"+i);
		}
 
		
		
	}

}
