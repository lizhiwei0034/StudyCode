package com.lzw.learn._05Colletction;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		//��ʼ��Set
		Set<String> s=null;
		//ͨ������ʵ����һ��
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
		//���ڲ����� �����ظ�Ԫ�� ��ӡ���Ϊ��[A, B, C, D, E, F]	 
		 
	}

}
