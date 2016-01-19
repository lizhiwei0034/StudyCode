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
			// ����һ���ļ�����
			File file = new File("test.txt");
			// ����һ���ļ����������ֽ�����
			FileInputStream fis = new FileInputStream(file);
			//���ֽ���ת�����ַ���
			InputStreamReader isr =new InputStreamReader(fis,"GB2312");
			//����һ���ַ������� ��ָ����С
			char input[]=new char[100];
			//ͨ���ַ��������ȡ����
			/**
			 * ע�� ����ȡ��ʱ����Ϊ��ÿ�ζ�ȡ100���ַ���
			 * �����һ�ζ�ȡ��ʱ��û�е�100���ַ�����ʱ��ϵͳ�Ὣ����������ַ���ȡ��
			 * �����100�������Դ�ʱ��ȡ�����ݾͲ�׼ȷ��
			 * while( isr.read(input)!=-1){
			 * System.out.println(input);
			 * }
			 * Ӧ���������޸ģ�			
			 */
			int l=0;
			while((l= isr.read(input))!=-1){
				System.out.println(new String(input,0,l));
			}
			//�ر���
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
