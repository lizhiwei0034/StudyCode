package com.lzw.learn.Generic;

class GenericVoid {
	// ����һ�����ͷ���
	public  <T> T show(T info) {
		return info;
	}
}

public class Generic04 {

	public static void main(String[] args) {
		
		//ʵ����GenericVoid
		GenericVoid g=new GenericVoid();
		//���÷��ͷ���,�������͵ķ���
		int i=g.show(878);
		String str= g.show("hah");
		float f= g.show(34.3444f);
		System.out.println(i);
		System.out.println(str);
		System.out.println(f);
	}

}
