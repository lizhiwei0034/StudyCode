package com.lzw.learn._07Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException; 

public class _02WriteByteStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("test.txt");
			String string="这个是一个新写入的文本";
			byte str[]=string.getBytes("UTF-8");
			fos.write(str);//这个是从头将原来的文本覆盖掉
			fos.write(str, 8, 6);//这个是将str从第8个字节开始向后截取6个字节写入 fos.write(b, off, len); b为字符，off为偏移量，len为截取的长度	  
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
