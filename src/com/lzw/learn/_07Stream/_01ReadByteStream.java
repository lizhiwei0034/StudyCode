package com.lzw.learn._07Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class _01ReadByteStream {
/**
 * 字节流读取文件
 * @param args
 */
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("test.txt");
			byte redstring[] =new byte[21];
			fis.read(redstring);
			fis.close();
			//现在数据都在redstring这个字节数组中
			String inputstr=new String(redstring,"UTF-8");
			System.out.println(inputstr);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
