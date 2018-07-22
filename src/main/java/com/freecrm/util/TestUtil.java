package com.freecrm.util;

import java.io.IOException;
import java.util.Hashtable;

public class TestUtil {

	public static Object[][]  getData(String tcName,String sheetName,Xls_Reader xls) throws IOException{
		int tcStartRow=0;
		while(!xls.getCellData(sheetName, 0, tcStartRow).equals(tcName)){
			System.out.println(xls.getCellData(sheetName, 0, tcStartRow));
			tcStartRow++;
		}
		//System.out.println(tcStartRow);
		
		int colStartRow=tcStartRow+1;
		int cols=0;
		while(!xls.getCellData(sheetName, cols, colStartRow).equals("N")){
			cols++;
		}
		//System.out.println(cols);
		
		int dataStartRow=tcStartRow+2;
		int rows=0;
		while(!xls.getCellData(sheetName, 0, dataStartRow+rows).equals("N")){
			rows++;
		}
		//System.out.println(rows);
		Object[][] data=new Object[rows][1];
		Hashtable<String,String> table=null;
		int index=0;
		for(int  rNum=dataStartRow;rNum<dataStartRow+rows;rNum++){
			table=new Hashtable();
			for(int cNum=0;cNum<cols;cNum++){
				String key=xls.getCellData(sheetName, cNum, colStartRow);
				String value=xls.getCellData(sheetName, cNum, rNum);
				//System.out.print(xls.getCellData(sheetName, cNum, rNum)+" ");
				table.put(key, value);
			}
			data[index][0]=table;
			index++;
			System.out.println();
		}
		return data;
	}
}
