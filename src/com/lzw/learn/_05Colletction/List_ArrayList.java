package com.lzw.learn._05Colletction;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		//List为接口，不能被实例化
		List<String> list=null;
		//必须通过子类去实例化	这里用的是ArrayList子类去实例化的	
		list = new ArrayList<String>();
		//为list添加元素
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("F");
		//
		list.remove(0);
		list.remove("F");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		 
		
		
	}

}
