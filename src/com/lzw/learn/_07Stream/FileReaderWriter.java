package com.lzw.learn._07Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReaderWriter {

	public static void main(String[] args) {
		try {
			//创建一个文件输入流
			FileReader fr=new FileReader("test.txt");
			//包装成带有缓冲区的输入流
			BufferedReader br=new BufferedReader(fr);
			
			//创建一个文件输出流
			FileWriter fw=new FileWriter("test_副本.txt");
			//包装成带有缓冲区的输出流
			//BufferedWriter bw =new BufferedWriter(fw);
			//或者用printwriter
			PrintWriter pw=new PrintWriter(fw,true);//这里参数中设置为true 表示最后无论缓冲区是否填充满都要强制输出缓冲区
			//循环读取			
			String str;
			while((str=br.readLine())!=null){
				pw.println(str);
			}
			//关闭流
			pw.close();	
			br.close();
			fw.close();
			fr.close();			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
