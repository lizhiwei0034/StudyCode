package com.lzw.learn._03Polymorphic;

//����һ����A
class AA {
	public void tell1() {
		System.out.println("����AA���е�tell1����");
	}

	public void tell2() {
		System.out.println("����AA���е�tell2����");
	}
}

// ����BB�̳�AA
class BB extends AA {
	// ��дA�е�tell1����
	public void tell1() {
		System.out.println("����BB������дAA���е�tell1����");
	}

	// ΪB�¶���һ��tell3����
	public void tell3() {
		System.out.println("����BB���е�tell3����");
	}
}

public class Polymorphic {

	public static void main(String[] args) {
		// ����ת��
		BB b = new BB();
		AA a = b;
		a.tell1();
		a.tell2();
		// ����ת��
		// ע�⣺����ת��֮ǰҪ������ת��
		AA a1 = new BB();// ����ת��
		BB b1 = (BB) a1;// ��������ת��
		// Ȼ�����ͨ��b1���ø���AA�Լ�����BB�еķ�����
		b1.tell1();
		b1.tell2();
		b1.tell3();
	}

}
