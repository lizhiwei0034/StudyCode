package com.lzw.learn._04Generic;

public class Generic05 {

	public static void main(String[] args) {
		//���÷��ͷ��� ��Ϊ��ָ��һ����ȷ������-String
		String[] str={"li","zhi","wei"};
		show(str);
		//���÷��ͷ��� ��Ϊ��ָ��һ����ȷ������-Integer
		Integer[] num={1,2,3,4};
		show(num);		
		//���÷��ͷ��� ��Ϊ��ָ��һ����ȷ������-Float
		Float[] fnum={2.3f,3.44f,34.009f};
		show(fnum);
	}
	//����һ�����ͷ���    ����Ϊ����������ʽ
	public static <T>void show(T args[]) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
