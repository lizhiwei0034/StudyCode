package com.lzw.learn._09XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class _02Dom4j {

	public static void main(String[] args) {
		//创建一个xml字符串
		String xmlString = "<root><people>ACELY</people></root>";
		try {
			//利用dom4j将字符串转换成xml文件
			Document document=DocumentHelper.parseText(xmlString);
			//打印
			System.out.println(document.asXML());
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
