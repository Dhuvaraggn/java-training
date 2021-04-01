package day17;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XML2 {	
	public static void main(String [] args) throws Exception{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document d=db.parse(new FileInputStream("books.xml"));
		Element e=d.getDocumentElement();
		Node n=e.getFirstChild();
			for(int i=0;i<e.getChildNodes().getLength();i++)
			{
				System.out.print(e.getChildNodes().item(i).getNodeName());
				if(e.getChildNodes().item(i).hasChildNodes())
				{
					printnode(e.getChildNodes().item(i));
				}
			}
		
	}
	public static void printnode(Node e) {
		for(int i=0;i<e.getChildNodes().getLength();i++)
		{
			System.out.print(e.getChildNodes().item(i).getNodeValue());
			if(e.getChildNodes().item(i).hasChildNodes())
			{
				printnode(e.getChildNodes().item(i));
			}
		}
	}
}
