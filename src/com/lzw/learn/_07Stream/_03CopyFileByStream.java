package com.lzw.learn._07Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03CopyFileByStream {

	public static void main(String[] args) {

		try {
			// ����Ҫ��ȡ�ļ�,����һ���ļ���ȡ�� ������
			FileInputStream inputfile = new FileInputStream("test.txt");
			// ���Ҫ�����������ط�����Ҫ����һ���ļ������,������������
			FileOutputStream outfile = new FileOutputStream("test_����.txt");
			// ����һ���ֽ����飬����ô�С��Ϊ���Ƶ���С��Ԫ
			byte copyinfo[] = new byte[50];
			while (inputfile.read(copyinfo) != -1) {
				// ���
				outfile.write(copyinfo);
			}
			System.out.println("done");
			//�ȴ򿪵ĺ�رա���򿪵��ȹر�
			outfile.close();
			inputfile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
