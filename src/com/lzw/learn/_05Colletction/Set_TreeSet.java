package com.lzw.learn._05Colletction;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		// ��ʼ��Set
		Set<String> t = null;
		// ͨ������ʵ����һ��
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
		// ���ڲ����� �����ظ�Ԫ�� ��ӡ���Ϊ��[A, B, C, D, E, F]
	}

}
