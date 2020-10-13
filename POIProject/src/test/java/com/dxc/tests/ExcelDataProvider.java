package com.dxc.tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import com.dxc.utilities.ExcelUtils;


public class ExcelDataProvider{
	static String projectpath=System.getProperty("user.dir");
	
	
	
	@Test(dataProvider = "getexceldata")
	public void getData(String username,String password){
		
		System.out.println(username +"|" + password);
		
	}
	
	@DataProvider(name = "getexceldata")
	public static Object[][] gettestdata(){
		ExcelUtils utils=new ExcelUtils(projectpath+"/Excel/data.xlsx", "Sheet1");
		
		int rowcount=ExcelUtils.getRowCount();
		int columncount=ExcelUtils.getColumnCount();
		Object[][] obj=new Object[rowcount+1][columncount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				
				obj[i-1][j]= ExcelUtils.getCellDataString(i,j);
			


				
				
			}
		}
		
		
		
		
		
		
		
		return obj;
		
		
	}

}
