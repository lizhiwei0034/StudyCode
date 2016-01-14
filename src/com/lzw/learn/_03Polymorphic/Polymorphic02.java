package com.lzw.learn._03Polymorphic;
//父类A1
class A1{
	public void tell1(){
		System.out.println("A1---tell1");
	}	
}
//子类B1继承自A1
class B1 extends A1{
	public static void tell2() {
		System.out.println("B1---tell2");
		
	}
}
//子类C1继承自A1
class C1 extends A1{
	public static void  tell3() {
		System.out.println("C1---tell3");
	}
}
public class Polymorphic02 {

	public static void main(String[] args) {
		//这里想通过子类对象使用A1中的方法
		say(new B1());
		say(new C1());
	}
	
	public static void say(A1 a) {
		a.tell1();
		
	}

}
