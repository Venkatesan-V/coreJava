package excelIntegration;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnToReadExcelData {

	public static String[][] readData(String dataprovexcel, int sheetno) throws IOException {
		
		// set the path of excel file
			XSSFWorkbook book=new XSSFWorkbook("./exceldata/dataprovexcel.xlsx");
		// read the data from the required sheet
			
			XSSFSheet sheet = book.getSheetAt(0); //or book.getSheet(0);
		// get into the row
			XSSFRow row = sheet.getRow(0); // entire second row in excel sheet
		// get into the cell
			XSSFCell cell = row.getCell(0); //reads second column (1,1)
		//to read the value from the cell
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		
		// to read all the datas
			int rowCount = sheet.getLastRowNum(); // to get the count of active row--omits 1st row as header
			System.out.println(rowCount);
		// to get all the rows including Header
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println(physicalNumberOfRows);
		
			int columnCount = row.getLastCellNum(); // To get the count of active column
			System.out.println(columnCount);
			
			String [][] data=new String[rowCount][columnCount];
			for (int i=1; i<=rowCount;i++) {
				for (int j=0; j<columnCount;j++) {
					//(1,0)(1,1)(1,2)(1,3)
					//(2,0)(2,1)(2,2)(2,3)
			// line 16-24 reduced to single line
				String allData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(allData);
				}
			}
			book.close();
			return data;
		
	}
}
