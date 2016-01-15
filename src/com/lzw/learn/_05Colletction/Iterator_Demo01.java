package com.lzw.learn._05Colletction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Demo01 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//输出 定义Iterator
		Iterator<String> Iter=list.iterator();
		while (Iter.hasNext()) {
			String str = (String) Iter.next();
			if("A".equals(str)){
				Iter.remove();//删除该条元素
				//【注意：】在Iterator输出过程中 不能再对集合List进行删除操作 如 list.Remove(2),会报错
			}
			else {
				System.out.println(str);				
			}
			
		}
	}

}
