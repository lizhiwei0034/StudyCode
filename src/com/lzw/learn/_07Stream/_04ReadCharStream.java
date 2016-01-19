package com.lzw.learn._07Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class _04ReadCharStream {

	public static void main(String[] args) {
		try {
			// 创建一个文件对象
			File file = new File("test.txt");
			// 创建一个文件输入流（字节流）
			FileInputStream fis = new FileInputStream(file);
			//将字节流转换成字符流
			InputStreamReader isr =new InputStreamReader(fis,"GB2312");
			//创建一个字符型数组 并指定大小
			char input[]=new char[100];
			//通过字符型数组读取数据
			/**
			 * 注意 这块读取的时候，因为是每次读取100个字符，
			 * 当最后一次读取的时候没有到100个字符，这时候系统会将其他冗余的字符截取并
			 * 填充满100个，所以此时读取的数据就不准确了
			 * while( isr.read(input)!=-1){
			 * System.out.println(input);
			 * }
			 * 应该做如下修改：			
			 */
			int l=0;
			while((l= isr.read(input))!=-1){
				System.out.println(new String(input,0,l));
			}
			//关闭流
			isr.close();
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
