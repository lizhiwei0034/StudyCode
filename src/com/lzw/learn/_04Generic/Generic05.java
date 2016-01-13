package com.lzw.learn._04Generic;

public class Generic05 {

	public static void main(String[] args) {
		//调用泛型方法 并为其指定一个明确的类型-String
		String[] str={"li","zhi","wei"};
		show(str);
		//调用泛型方法 并为其指定一个明确的类型-Integer
		Integer[] num={1,2,3,4};
		show(num);		
		//调用泛型方法 并为其指定一个明确的类型-Float
		Float[] fnum={2.3f,3.44f,34.009f};
		show(fnum);
	}
	//定义一个泛型方法    参数为泛型数组形式
	public static <T>void show(T args[]) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
