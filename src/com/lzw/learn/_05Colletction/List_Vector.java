package com.lzw.learn._05Colletction;

import java.util.List;
import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		// ListΪ�ӿڣ����ܱ�ʵ����
		List<String> list = null;
		// ����ͨ������ȥʵ���� �����õ���ArrayList����ȥʵ������
		list = new Vector<String>();
		// Ϊlist���Ԫ��
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
