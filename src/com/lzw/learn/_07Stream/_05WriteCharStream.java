package com.lzw.learn._07Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class _05WriteCharStream {
/**
 * 通过字符流复制数据
 * @param args
 */
	public static void main(String[] args) {
		try {
			//定义读取文件流（字节流）
			FileInputStream fis =new FileInputStream("test.txt");
			//定义输出文件流（字节流）
			FileOutputStream  fos=new FileOutputStream("testcopy.txt");		
			//将读取的字节流转换成输入的字符流
			InputStreamReader isr=new InputStreamReader(fis,"GB2312");
			//将输出的字节流转换成输出的字符流			 
			OutputStreamWriter osw =new OutputStreamWriter(fos,"GB2312");
			char input[] =new char[100];
			int l=0;
			while((l=isr.read(input))!=-1){
				osw.write(input, 0, l);				
			}
			//先打开的后关闭、后代开的先关闭
			osw.close();
			isr.close();
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
