package com.lzw.learn._08Thread;

/**
 * ͨ��ʵ��Runnable�ӿ���ʵ�ֶ��߳�
 * 
 * @param args
 */
public class MyRunnable implements Runnable {
	//��������
	private String name;
	//���췽��
	public MyRunnable(String name) {
	this.name=name;	
	}
	//ʵ�ֽӿ��еĳ��󷽷�
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
}
