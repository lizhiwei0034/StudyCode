package com.lzw.learn._03Polymorphic;

//定义一个类A
class AA {
	public void tell1() {
		System.out.println("这是AA类中的tell1方法");
	}

	public void tell2() {
		System.out.println("这是AA类中的tell2方法");
	}
}

// 子类BB继承AA
class BB extends AA {
	// 重写A中的tell1方法
	public void tell1() {
		System.out.println("这是BB类中重写AA类中的tell1方法");
	}

	// 为B新定义一个tell3方法
	public void tell3() {
		System.out.println("这是BB类中的tell3方法");
	}
}

public class Polymorphic {

	public static void main(String[] args) {
		// 向上转型
		BB b = new BB();
		AA a = b;
		a.tell1();
		a.tell2();
		// 向下转型
		// 注意：向下转型之前要先向上转型
		AA a1 = new BB();// 向上转型
		BB b1 = (BB) a1;// 发生向下转型
		// 然后可以通过b1调用父类AA以及子类BB中的方法了
		b1.tell1();
		b1.tell2();
		b1.tell3();
	}

}
