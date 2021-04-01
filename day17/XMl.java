package day17;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMl {
	public static void main(String [] args) throws Exception {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document d=db.parse(new FileInputStream("books.xml"));
		Element e=d.getDocumentElement();
		
		Node newn=d.createElement("newe");
		Node newd=d.createTextNode("new data...");
		Node newa=d.createAttribute("bid");
		Node newav=d.createTextNode("a1111");
		
		newa.appendChild(newav);
		newn.getAttributes().setNamedItem(newa);
		newn.appendChild(newd);
		
		e.insertBefore(newn.cloneNode(true), e.getFirstChild());
		e.appendChild(newn.cloneNode(true));
		
		Transformer transform=TransformerFactory.newInstance().newTransformer();
		transform.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource doms=new DOMSource(d);
		StringWriter sw=new StringWriter();
		StreamResult sr=new StreamResult(sw);
		transform.transform(doms, sr);
		
		System.out.print(sw.toString());

		FileWriter out=new FileWriter("newbooks.xml");
		out.write(sw.toString());
		out.close();
	}
}
