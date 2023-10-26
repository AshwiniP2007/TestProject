package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CofigCostco 
{
	public static String getPropVal(String propName) {
	
	System.out.println(propName);

	FileReader input=null;
	try
	{
		input = new FileReader("C:\\Users\\ashwi\\eclipse-workspace\\CostcoSeleniumFramework\\src\\main\\java\\configuration\\config.properties");

	}
	catch (FileNotFoundException e){
		e.printStackTrace();
	}


	Properties p =new Properties();
	
	try {
		p.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(p.getProperty(propName));
	//no need of sysout just to practice
	return p.getProperty(propName);
	
}
}
