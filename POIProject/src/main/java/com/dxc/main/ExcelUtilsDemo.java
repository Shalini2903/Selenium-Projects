package com.dxc.main;

import com.dxc.utilities.ExcelUtils;

public class ExcelUtilsDemo {
	static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {
		
		ExcelUtils utils=new ExcelUtils(projectpath+"/Excel/data.xlsx", "Sheet1");
		utils.getRowCount();
		utils.getColumnCount();
		utils.getCellDataString(1,0);
		utils.getCellDataNumeric(1, 1);
		
	}
}
