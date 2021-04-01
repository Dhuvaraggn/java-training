package day17;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLAccessing {
	public static void main(String [] args) throws Exception {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document d=db.parse(new FileInputStream("books.xml"));
		Element e=d.getDocumentElement();
		System.out.print(e.getNodeName());
		System.out.print(e.hasChildNodes());
		Node n=e.getFirstChild();
		for(int i=0;i<e.getChildNodes().getLength();i++) {
			for(int j=0;j<e.getChildNodes().item(i).getChildNodes().getLength();j++) {
				System.out.print(e.getChildNodes().item(i).getChildNodes().item(j).getFirstChild().getNodeValue());
			}
		}
	}
}
 