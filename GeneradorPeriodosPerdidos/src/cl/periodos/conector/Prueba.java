package cl.periodos.conector;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prueba {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("myProp.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String key : prop.stringPropertyNames()) {
			  String value = prop.getProperty(key);
			  System.out.println(key + " => " + value);
		}

	}

}
