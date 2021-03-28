package day15;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class Assignment  
{  
public static void main(String args[]) throws IOException  
{
	
//obtaining input bytes from a file  
FileInputStream fis=new FileInputStream(new File("C:\\\\Users\\\\VC\\\\eclipse-workspace\\\\basicproject\\\\ajithexcel.xlsx"));  
//creating workbook instance that refers to .xls file  
XSSFWorkbook wb=new XSSFWorkbook(fis);   
//creating a Sheet object to retrieve the object  
XSSFSheet sheet=wb.getSheetAt(0);  

FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
//evaluating cell type   
for(Row row: sheet)     //iteration over row using for each loop  
{  
for(Cell cell: row)    //iteration over cell using for each loop  
{ 
	//System.out.print(cell.getStringCellValue());
	//System.out.print(formulaEvaluator.evaluateInCell(cell).getCellType());
	
switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
{  
case NUMERIC:   //field that represents numeric cell type  
//getting the value of the cell as a number  
System.out.print(cell.getNumericCellValue()+ "\t\t");   
break;  
case STRING:    //field that represents string cell type  
//getting the value of the cell as a string  
System.out.print(cell.getStringCellValue()+ "\t\t");  
break;  
} 
}  
System.out.println();  
}
wb.close();
}  
}  
	