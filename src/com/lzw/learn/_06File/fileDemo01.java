package com.lzw.learn._06File;

import java.io.File;

public class fileDemo01 {

	public static void main(String[] args) {

		String str = "C:\\";
		File f = new File(str);
		fun(f);
	}

	// Ҫ�����г�����Ϊ������File����������һ��Ŀ¼
	public static void fun(File f) {
		// �жϸ�����·���Ƿ���Ŀ¼�������Ŀ¼���г�
		if (f.isDirectory()) {
			File[] file = f.listFiles();
			// ������ѭ�������ж�
			try {
				for (int i = 0; i < file.length; i++) {
					// ���������ݴ��뵽fun����֮�н�����֤
					fun(file[i]);
				}
			} catch (Exception e) {
			}
		} else {
			System.out.println(f);
		}
	}

}


