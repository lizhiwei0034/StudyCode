package com.lzw.learn._07Stream;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class _08Apache_IO {

	public static void main(String[] args) {
		File f1=new File("test.txt");
		File f2=new File("testcopy.txt");
		
		try {
			//���õ�Apache iO�е�FileUtils  ���ҿ���ֱ���þ�̬��������
			FileUtils.copyFile(f1, f2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
