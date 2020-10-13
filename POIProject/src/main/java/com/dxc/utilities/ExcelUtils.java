package com.dxc.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String excelpath;
	static String sheetname;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelpath,String sheetname) {
		this.excelpath=excelpath;
		this.sheetname=sheetname;
		try {
		workbook=new XSSFWorkbook(excelpath);
		 sheet=workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int getRowCount() {
		int rowcount=sheet.getPhysicalNumberOfRows();
		
			System.out.println("No. of rows:"+rowcount);
			return rowcount;
			
	}

	public static int getColumnCount() {
		
		int columncount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Column count:"+columncount);
		return columncount;
		
	}
	
	public static String getCellDataString(int rownum,int columnnum) {
		
		String celldata=sheet.getRow(rownum).getCell(columnnum).getStringCellValue();
		return celldata;
		
	}

	public void getCellDataNumeric(int rownum,int columnnum) {
		
		System.out.println(sheet.getRow(rownum).getCell(columnnum).getNumericCellValue());
		
	}
}
