package com.lzw.learn._08Thread;

public class ThreadDemo01 {
	/**
	 * ͨ��Thread��ʵ�ֶ��߳�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ����һ�� ͨ��Thread����ʵ��
		 */
		// ʵ���������߳�
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		// ͨ����������еķ���:���Ⱥ�˳���
		mt1.run();
		mt2.run();
		// �����̵߳�����ʱͨ��Start()��ִ�еģ�����ͬʱ������Դ��ִ�С�
		mt1.start();
		mt2.start();
		/**
		 * ��������ͨ��Runnable�ӿ���ʵ��
		 */
		// ʵ��������MyRunnable
		MyRunnable mr1 = new MyRunnable("A");
		MyRunnable mr2 = new MyRunnable("B");
		// ʵ����һ���߳�
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		// �����߳�
		t1.start();
		t2.start();
	}
}
