package com.lzw.learn.AbstractClass;

//����һ���ӿڣ���ʵ���൱��һ�������淶��������һ���ĳ��󷽷���
interface USB {
	// ���󷽷�1����ʼ����
	void start();

	// ���󷽷�2����������
	void end();
}

// ����һ��U���࣬ʵ��usb��ʹ��
class UsebDisk implements USB {

	@Override
	public void start() {
		System.out.println("���̿�ʼ����");
	}

	@Override
	public void end() {
		System.out.println("����ֹͣ����");
	}

}
//����һ����ӡ��
class Printer implements USB{
	@Override
	public void start() {
		System.out.println("��ʼ��ӡ");
	}
	@Override
	public void end() {
		System.out.println("ֹͣ��ӡ");
	}
}
//����һ������� 
class Computer{
	//����һ������  ����Ϊ��������ʵ���Խӿ�USB�����඼���ԣ�
	public static void work(USB u) {
		u.start();
		System.out.println("���ڹ����С�����������");
		u.end();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		//ʵ���������		
		Computer.work(new UsebDisk());
		Computer.work(new Printer());
			
	}

}
