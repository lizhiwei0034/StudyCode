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
		//��� ����Iterator
		Iterator<String> Iter=list.iterator();
		while (Iter.hasNext()) {
			String str = (String) Iter.next();
			if("A".equals(str)){
				Iter.remove();//ɾ������Ԫ��
				//��ע�⣺����Iterator��������� �����ٶԼ���List����ɾ������ �� list.Remove(2),�ᱨ��
			}
			else {
				System.out.println(str);				
			}
			
		}
	}

}
