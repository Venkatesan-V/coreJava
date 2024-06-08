package p03052024;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ecelldata03 {

	public static String[][] readData() throws IOException {
		
		XSSFWorkbook book=new XSSFWorkbook("./exceldata/dummy.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = row.getLastCellNum();
		System.out.println(rowCount);
		System.out.println(columnCount);
		int totalRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(totalRows);
		
		String[][] data= new String [rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j <columnCount; j++) {
				String allData = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=allData;
				System.out.println(allData);
			}
		}
		
		
		
		
		
		book.close();
		return data;
		
	}
}
