package com.lzw.learn._03Polymorphic;
//����A1
class A1{
	public void tell1(){
		System.out.println("A1---tell1");
	}	
}
//����B1�̳���A1
class B1 extends A1{
	public static void tell2() {
		System.out.println("B1---tell2");
		
	}
}
//����C1�̳���A1
class C1 extends A1{
	public static void  tell3() {
		System.out.println("C1---tell3");
	}
}
public class Polymorphic02 {

	public static void main(String[] args) {
		//������ͨ���������ʹ��A1�еķ���
		say(new B1());
		say(new C1());
	}
	
	public static void say(A1 a) {
		a.tell1();
		
	}

}
