package com.lzw.learn._07Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException; 

public class _02WriteByteStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("test.txt");
			String string="�����һ����д����ı�";
			byte str[]=string.getBytes("UTF-8");
			fos.write(str);//����Ǵ�ͷ��ԭ�����ı����ǵ�
			fos.write(str, 8, 6);//����ǽ�str�ӵ�8���ֽڿ�ʼ����ȡ6���ֽ�д�� fos.write(b, off, len); bΪ�ַ���offΪƫ������lenΪ��ȡ�ĳ���	  
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
