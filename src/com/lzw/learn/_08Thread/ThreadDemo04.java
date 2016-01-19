package com.lzw.learn._08Thread;

class ticket implements Runnable {
	// ����5��Ʊ
	private int tic = 5;
	
	//��дrun����ʵ����Ʊ����
	@Override
	public void run() {
		//ʵ��ͬ����
		synchronized (this) {//�������ͬ���Ĵ���
			//��������10�ΰ�
			for (int i = 0; i < 10; i++) {
				if(tic>0){
					//�ӳ�1����
					try {
						Thread.sleep(1000);
						System.out.println("��Ʊ��"+tic--); 
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
		//ʵ����һ����վ
		ticket station=	new ticket();
		//����3������ t1  t2  t3
		Thread t1=new Thread(station,"T1");
		Thread t2=new Thread(station,"T2");
		Thread t3=new Thread(station,"T2");
		//��������ͬʱ��Ʊ
		t1.start();
		t2.start();
		t3.start();

	}

}
