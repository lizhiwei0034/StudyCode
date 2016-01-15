package com.lzw.learn._05Colletction;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		// 初始化Set
		Set<String> t = null;
		// 通过子类实例化一下
		t = new TreeSet<String>();
		t.add("C");
		t.add("A");
		t.add("B");
		t.add("E");
		t.add("D");
		t.add("F");
		t.add("A");
		t.add("A");
		System.out.println(t);
		// 由于不允许 存在重复元素 打印结果为：[A, B, C, D, E, F]
	}

}
