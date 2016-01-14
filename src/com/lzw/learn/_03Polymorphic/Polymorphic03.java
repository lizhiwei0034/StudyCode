package com.lzw.learn._03Polymorphic;
/**
 * instanceof�ؼ��ֵ�ʹ�ã��ж�ĳһ�������Ƿ�ʵ������
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
		//�ж�a�Ƿ���ʵ������
		System.out.println(a instanceof A);//TRUE
		System.out.println(a instanceof B);//FALSE
		//BΪA������
		A b=new B();
		System.out.println(b instanceof A);//TEUR
		System.out.println(b instanceof B);//TRUE
		
	}

}
