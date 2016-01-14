package com.lzw.learn._05Colletction;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		//初始化Set
		Set<String> s=null;
		//通过子类实例化一下
		s=new HashSet<String>();
		s.add("C");
		s.add("A");
		s.add("B");	
		s.add("E");
		s.add("D");
		s.add("F");
		s.add("A");
		s.add("A");
		System.out.println(s);
		//由于不允许 存在重复元素 打印结果为：[A, B, C, D, E, F]	 
		 
	}

}
