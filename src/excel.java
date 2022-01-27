import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File ("C:\\Users\\ankur.dalmiya\\Desktop\\abc.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);

		int rowCount = sheet1.getLastRowNum();
		int totalRows = rowCount+1;
		System.out.println(totalRows);
			for (int i=0; i<totalRows; i++)
			{
				String data2=sheet1.getRow(i).getCell(0).getStringCellValue();
				System.out.println(data2);
			}
	}

}
