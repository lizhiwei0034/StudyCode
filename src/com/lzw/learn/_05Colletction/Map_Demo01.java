package com.lzw.learn._05Colletction;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Demo01 {
	public static void main(String[] args) {
		// ����һ��Map����������HashMapȥʵ����
		Map<String, String> m = new HashMap<String, String>();
		// ��put����Ϊmap�������ݣ���ֵ�ԣ�
		m.put("key1", "hello");
		m.put("key2", "world");
		m.put("key3", "this");
		m.put("key4", "is a demo");
		// ʹ��set��������������keyֵ
		Set<String> s = m.keySet();
		// 1������iterator���keyֵ
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}
		// 2����collection��������valueֵ
		Collection<String> c = m.values();
		Iterator<String> iter = c.iterator();
		while(iter.hasNext()){
			String strv=iter.next();
			System.out.println(strv);
		}

	}
}