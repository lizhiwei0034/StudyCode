package com.lzw.learn._06File;

import java.io.File;

public class HelloFile {

	public static void main(String[] args) {
		File f=new File("test.exe");
		//获取绝对路径
		f.getAbsolutePath();
		System.out.println(f.canExecute());
		
	}

}
