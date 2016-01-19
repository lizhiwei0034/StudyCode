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
			//����һ���ļ�������
			FileReader fr=new FileReader("test.txt");
			//��װ�ɴ��л�������������
			BufferedReader br=new BufferedReader(fr);
			
			//����һ���ļ������
			FileWriter fw=new FileWriter("test_����.txt");
			//��װ�ɴ��л������������
			//BufferedWriter bw =new BufferedWriter(fw);
			//������printwriter
			PrintWriter pw=new PrintWriter(fw,true);//�������������Ϊtrue ��ʾ������ۻ������Ƿ��������Ҫǿ�����������
			//ѭ����ȡ			
			String str;
			while((str=br.readLine())!=null){
				pw.println(str);
			}
			//�ر���
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
