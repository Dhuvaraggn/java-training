package Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelImpl  extends UnicastRemoteObject implements Excel,Serializable{
	public ExcelImpl() throws RemoteException
	{
		System.out.print("excel cons");
	}
	public static void main(String [] args) throws Exception {
		
		ExcelImpl excel=new ExcelImpl();
		LocateRegistry.createRegistry(3000);
		Naming.bind("rmi://localhost:3000/service/excel", excel);
		//intoExcel(filename,m,row,mt);
		//System.out.print(getrowExcel(filename));
		//writeExcel(wb,sheet);
		//readExcel(wb,sheet);		
		} 
	
		public static int getrowExcel(String s) throws Exception {
			FileInputStream fis=new FileInputStream(s);
			XSSFWorkbook wb=new XSSFWorkbook(fis); 
			XSSFSheet sheet=wb.getSheetAt(0); 
			int rcount=0;
			for(Row r:sheet) {
				rcount++;
			}
			fis.close();
			wb.close();
			return rcount;

		}
		@Override
		public  void intoExcel(Map m,long mt) throws Exception {
			String filename="C:\\\\Users\\\\VC\\\\eclipse-workspace\\\\basicproject\\\\InvoiceExcel.xlsx";  
			int rcount=getrowExcel(filename);
			
			FileInputStream fis=new FileInputStream(filename);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			System.out.print(sheet);
			Row row1=sheet.createRow(rcount+1);
			Cell c1=row1.createCell(0);
			LocalDateTime l=LocalDateTime.now();
			c1.setCellValue(mt+"");
			c1=row1.createCell(1);
			c1.setCellValue(m.get("Mutton")+"");
			c1=row1.createCell(2);
			c1.setCellValue(m.get("Chicken")+"");
			c1=row1.createCell(3);
			c1.setCellValue(m.get("Vegfry")+"");
			c1=row1.createCell(4);
			c1.setCellValue(m.get("Daal")+"");
			c1=row1.createCell(5);
			c1.setCellValue(m.get("Rice")+"");
			c1=row1.createCell(6);
			c1.setCellValue(m.get("sgst")+"");
			c1=row1.createCell(7);
			c1.setCellValue(m.get("cgst")+"");
			c1=row1.createCell(8);
			c1.setCellValue(m.get("discount")+"");
			c1=row1.createCell(9);
			c1.setCellValue(m.get("total")+"");
			
			FileOutputStream fo=new FileOutputStream(filename);  		
			wb.write(fo);
			fo.close();
		}
		public void readExcel() throws IOException {
			String s="C:\\\\Users\\\\VC\\\\eclipse-workspace\\\\basicproject\\\\InvoiceExcel.xlsx";  
			
			FileInputStream fis=new FileInputStream(s);
			XSSFWorkbook wb=new XSSFWorkbook(fis); 
			XSSFSheet sheet=wb.getSheetAt(0); 
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
		  
		for(Row row: sheet)    
		{  
		for(Cell cell: row)      
		{ 
		switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
		{  
		case NUMERIC:   
		System.out.print(cell.getNumericCellValue()+ "\t\t");   
		break;  
		case STRING:   
		System.out.print(cell.getStringCellValue()+ "\t\t");  
		break;  
		} 
		}  
		System.out.println();  
		}
	}	
		
	
}
