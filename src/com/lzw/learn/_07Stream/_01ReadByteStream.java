package com.lzw.learn._07Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class _01ReadByteStream {
/**
 * �ֽ�����ȡ�ļ�
 * @param args
 */
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("test.txt");
			byte redstring[] =new byte[21];
			fis.read(redstring);
			fis.close();
			//�������ݶ���redstring����ֽ�������
			String inputstr=new String(redstring,"UTF-8");
			System.out.println(inputstr);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
