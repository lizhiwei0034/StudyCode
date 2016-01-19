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
			// �����ȡ�ļ������ֽ�����
			FileInputStream fis = new FileInputStream("test.txt");
			// ��������ļ������ֽ�����
			FileOutputStream fos = new FileOutputStream("testcopy.txt");
			// ����ȡ���ֽ���ת����������ַ���
			InputStreamReader isr = new InputStreamReader(fis, "GB2312");
			// ��������ֽ���ת����������ַ���
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GB2312");

			// ��װ�ɴ���buffer��������
			BufferedReader br = new BufferedReader(isr);
			// ����������� ����д�����з�
			BufferedWriter bw = new BufferedWriter(osw);
			// Ϊ�˿���д�����з�����ʹ��printWriter
			PrintWriter pw = new PrintWriter(osw);			
			String input;
			while ((input = br.readLine()) != null) {
				// ��ע�⡿�������ֱ����bw.write(input);��������Ļ� �ᵼ���ı������еĻ����ַ�����ʧ���ˡ�
				// ����ķ����޻��з�
				bw.write(input);
				// ����ķ����л��з�
				pw.println(input);
			}
			/**
			 * ���������õ��˻�����buffer����˻������������� ����������û��������ʱ�� �ǲ�ִ����������ģ�
			 * ��˺��п��ܳ������ݶ�ʧ�����������Ҫ�Ըû���������ǿ�����BufferedWriter. flush()
			 */
			// ǿ�ƽ����������������
			//������ﲻ��flush()�����Ļ���������ʵ������ʱ�򽫵ڶ�����������Ϊtrue����
			//PrintWriter pw=new PrintWriter(fw,true) 
			//��ʾ������ۻ������Ƿ��������Ҫǿ�����������
			bw.flush();
			pw.flush();

			// �ȴ򿪵ĺ�رա���������ȹر�
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
