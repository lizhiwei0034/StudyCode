package com.lzw.learn._03Polymorphic;
/**
 * instanceof关键字的使用（判断某一个对象是否被实例化）
 * @author mysti_000
 *
 */
class A{
	public void tell1(){
		System.out.println("A---tell1");
	}
	public void tell2() {
		System.out.println("A---tell2");
	}
}
class B extends A{
	@Override
	public void tell1() {
		
		System.out.println("B---tell1");
	}
	public void tell3(){
		System.out.println("C----tell3");
	}
}
public class Polymorphic03 {

	public static void main(String[] args) {
		A a =new A();
		//判断a是否是实例化的
		System.out.println(a instanceof A);//TRUE
		System.out.println(a instanceof B);//FALSE
		//B为A的子类
		A b=new B();
		System.out.println(b instanceof A);//TEUR
		System.out.println(b instanceof B);//TRUE
		
	}

}
