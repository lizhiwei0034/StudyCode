package com.lzw.learn.Generic;

class GenericVoid {
	// 定义一个泛型方法
	public  <T> T show(T info) {
		return info;
	}
}

public class Generic04 {

	public static void main(String[] args) {
		
		//实例化GenericVoid
		GenericVoid g=new GenericVoid();
		//调用泛型方法,三种类型的方法
		int i=g.show(878);
		String str= g.show("hah");
		float f= g.show(34.3444f);
		System.out.println(i);
		System.out.println(str);
		System.out.println(f);
	}

}
