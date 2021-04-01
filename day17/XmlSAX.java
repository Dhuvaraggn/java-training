package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class XmlSAX {
	public static void main(String [] args) throws Exception, SAXException, IOException {
	SAXParserFactory spf=SAXParserFactory.newInstance();
	SAXParser sp=spf.newSAXParser();
	sp.parse(new FileInputStream("books.xml"),new MyProcessingHandler());
	}
}
class MyProcessingHandler extends DefaultHandler
{
	@Override
	public void startDocument() throws SAXException
	{
		System.out.println("docu started");
	}
	@Override 
	public void endDocument() throws SAXException
	{
		System.out.println("end docu");
	}
	@Override
	public void startElement(String uri,String localname,String qName,Attributes attributes) throws SAXException
	{
		System.out.println(qName);
		for(int i=0;i<attributes.getLength();i++)
			{System.out.println(attributes.getQName(i));
			System.out.print(attributes.getValue(i));
			}
	}
	@Override
	public void endElement(String uri,String localname,String qName) throws SAXException
	{
		System.out.println(qName);
	}
	@Override
	public void characters(char[] ch,int start,int length) throws SAXException
	{
		System.out.println(new String(ch,start,length));
	}
}