package com.pentachrome.cartcatalyst.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility 
{
	public String readDataFromPropertyFile(String)
	{
		FileInputStream fis = new FileInputStream(IpathConstant))
				Properties pObj = new Properties();
				pObj.load(fis);
				String value = pObj.getProperty(null);
				return value;
				
		
	}

}
