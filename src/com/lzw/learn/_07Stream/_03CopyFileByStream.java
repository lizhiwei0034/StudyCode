package com.lzw.learn._07Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03CopyFileByStream {

	public static void main(String[] args) {

		try {
			// 首先要读取文件,创建一个文件读取的 输入流
			FileInputStream inputfile = new FileInputStream("test.txt");
			// 如果要拷贝到其他地方，则要创建一个文件输出流,并给予重命名
			FileOutputStream outfile = new FileOutputStream("test_副本.txt");
			// 创建一个字节数组，定义好大小做为复制的最小单元
			byte copyinfo[] = new byte[50];
			while (inputfile.read(copyinfo) != -1) {
				// 输出
				outfile.write(copyinfo);
			}
			System.out.println("done");
			//先打开的后关闭、后打开的先关闭
			outfile.close();
			inputfile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
