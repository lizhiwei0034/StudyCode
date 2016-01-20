package com.lzw.learn._09XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class _02Dom4j {

	public static void main(String[] args) {
		//����һ��xml�ַ���
		String xmlString = "<root><people>ACELY</people></root>";
		try {
			//����dom4j���ַ���ת����xml�ļ�
			Document document=DocumentHelper.parseText(xmlString);
			//��ӡ
			System.out.println(document.asXML());
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
