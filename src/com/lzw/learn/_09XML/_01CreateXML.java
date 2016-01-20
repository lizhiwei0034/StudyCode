package com.lzw.learn._09XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element; 
import java.io.File;
import java.io.StringWriter; 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class _01CreateXML {
	/**
	 * ʹ��dom��������xm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			// ����һ����Ԫ��Language
			Element root = document.createElement("Language");
			// ΪԪ���������
			root.setAttribute("cat", "it");

			for (int i = 0; i < 10; i++) {
				// ����һ��Ԫ��lan
				Element lan = document.createElement("lan");
				// ΪԪ���������
				lan.setAttribute("id", String.valueOf(i));
				// �ڴ�������Ԫ��name1��ide1,����Ϊ�������ı���Ϣ��
				Element name = document.createElement("name");
				name.setTextContent("����" + i);
				Element ide = document.createElement("ide");
				ide.setTextContent("��������" + i);
				lan.appendChild(name);
				lan.appendChild(ide);
				root.appendChild(lan);
			}
			document.appendChild(root);

			// ----------���xml-----------
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			StringWriter string = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(string));
			// ��ӡ
			System.out.println(string);
			// ����xml�ļ�
			transformer.transform(new DOMSource(document), new StreamResult(new File("language.xml")));

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}

	}

}
