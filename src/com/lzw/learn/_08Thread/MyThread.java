	package com.lzw.learn._08Thread;
	/**
	 * ����һ������ ���̳�Thread��
	 * @author mysti_000
	 *
	 */
	public class MyThread extends Thread {
		private String name;
	
		// ����һ�����캯��
		public MyThread(String name) {
			this.name = name;
		}
	
		// ��дrun����
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println(name + ":" + i);
			}
			super.run();
		}
	
	}
