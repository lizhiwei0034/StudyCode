package com.lzw.learn._05Colletction;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		//ListΪ�ӿڣ����ܱ�ʵ����
		List<String> list=null;
		//����ͨ������ȥʵ����	�����õ���ArrayList����ȥʵ������	
		list = new ArrayList<String>();
		//Ϊlist���Ԫ��
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
