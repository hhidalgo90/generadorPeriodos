package cl.periodos.conector;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Prueba {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			OutputStream output = new FileOutputStream("myProp.properties");
			
			prop.store(output, null);

	        System.out.println(prop);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(String key : prop.stringPropertyNames()) {
//			  String value = prop.getProperty(key);
//			  System.out.println(key + " => " + value);
//		}
		


	}

}
