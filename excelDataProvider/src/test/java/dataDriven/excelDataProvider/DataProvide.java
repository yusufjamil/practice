package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide 
{
	DataFormatter formatter=new DataFormatter();
@Test(dataProvider="driveTest")
public void testCaseData(String a,String b,String c) 
{
	System.out.println(a+b+c);
}

@DataProvider(name="driveTest")
public Object[][] getData() throws IOException 
{
	//Object[][] data= {{"a1","b1",1},{"a2","b2",2},{"a3","b3",3}};
	FileInputStream fis=new FileInputStream("C://Users//Jalil//Downloads//demo.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	XSSFSheet sheet=book.getSheetAt(0);
	int rowCount=sheet.getPhysicalNumberOfRows();
	XSSFRow row=sheet.getRow(0);
	int colCount=row.getLastCellNum();
	Object testData [][]=new Object[rowCount-1][colCount];
	for(int i=0;i<rowCount-1;i++) 
	{
		row=sheet.getRow(i+1);
		for(int j=0;j<colCount;j++) 
		{
			XSSFCell cell=row.getCell(j);
			testData[i][j]=formatter.formatCellValue(cell);
		}
	}
	return testData;
}

}



