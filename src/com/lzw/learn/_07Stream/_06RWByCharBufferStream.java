package com.lzw.learn._07Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class _06RWByCharBufferStream {

	public static void main(String[] args) {
		try {
			// 定义读取文件流（字节流）
			FileInputStream fis = new FileInputStream("test.txt");
			// 定义输出文件流（字节流）
			FileOutputStream fos = new FileOutputStream("testcopy.txt");
			// 将读取的字节流转换成输入的字符流
			InputStreamReader isr = new InputStreamReader(fis, "GB2312");
			// 将输出的字节流转换成输出的字符流
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GB2312");

			// 包装成带有buffer的输入流
			BufferedReader br = new BufferedReader(isr);
			// 下面这个方法 不能写出换行符
			BufferedWriter bw = new BufferedWriter(osw);
			// 为了可以写出换行符可以使用printWriter
			PrintWriter pw = new PrintWriter(osw);			
			String input;
			while ((input = br.readLine()) != null) {
				// 【注意】这里如果直接用bw.write(input);方法输出的话 会导致文本中所有的换行字符都消失掉了。
				// 下面的方法无换行符
				bw.write(input);
				// 下面的方法有换行符
				pw.println(input);
			}
			/**
			 * 这里由于用到了缓冲区buffer，因此会出现如下情况： 当缓冲区还没有填满的时候， 是不执行输出操作的，
			 * 因此很有可能出现数据丢失的情况，所以要对该缓冲区进行强制输出BufferedWriter. flush()
			 */
			// 强制将缓冲区中数据输出
			//如果这里不用flush()方法的话，可以在实例化的时候将第二个参数设置为true即：
			//PrintWriter pw=new PrintWriter(fw,true) 
			//表示最后无论缓冲区是否填充满都要强制输出缓冲区
			bw.flush();
			pw.flush();

			// 先打开的后关闭、后代开的先关闭
			pw.close();
			bw.close();
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
