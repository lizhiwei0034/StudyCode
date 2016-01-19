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
 * ͨ���ַ�����������
 * @param args
 */
	public static void main(String[] args) {
		try {
			//�����ȡ�ļ������ֽ�����
			FileInputStream fis =new FileInputStream("test.txt");
			//��������ļ������ֽ�����
			FileOutputStream  fos=new FileOutputStream("testcopy.txt");		
			//����ȡ���ֽ���ת����������ַ���
			InputStreamReader isr=new InputStreamReader(fis,"GB2312");
			//��������ֽ���ת����������ַ���			 
			OutputStreamWriter osw =new OutputStreamWriter(fos,"GB2312");
			char input[] =new char[100];
			int l=0;
			while((l=isr.read(input))!=-1){
				osw.write(input, 0, l);				
			}
			//�ȴ򿪵ĺ�رա���������ȹر�
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
