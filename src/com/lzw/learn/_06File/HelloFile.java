package com.lzw.learn._06File;

import java.io.File;

public class HelloFile {

	public static void main(String[] args) {
		File f=new File("test.exe");
		//��ȡ����·��
		f.getAbsolutePath();
		System.out.println(f.canExecute());
		
	}

}
