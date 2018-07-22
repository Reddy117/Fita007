package com.freecrm.util;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Xls_Reader xls=new  Xls_Reader();
		TestUtil.getData("TC3","Sheet1", xls);
		
	}
}
