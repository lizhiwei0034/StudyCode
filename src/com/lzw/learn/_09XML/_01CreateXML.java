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
	 * 使用dom方法创建xm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			// 创建一个根元素Language
			Element root = document.createElement("Language");
			// 为元素添加属性
			root.setAttribute("cat", "it");

			for (int i = 0; i < 10; i++) {
				// 创建一个元素lan
				Element lan = document.createElement("lan");
				// 为元素添加属性
				lan.setAttribute("id", String.valueOf(i));
				// 在创建两个元素name1、ide1,并且为其增加文本信息。
				Element name = document.createElement("name");
				name.setTextContent("语言" + i);
				Element ide = document.createElement("ide");
				ide.setTextContent("开发环境" + i);
				lan.appendChild(name);
				lan.appendChild(ide);
				root.appendChild(lan);
			}
			document.appendChild(root);

			// ----------输出xml-----------
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			StringWriter string = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(string));
			// 打印
			System.out.println(string);
			// 创建xml文件
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
