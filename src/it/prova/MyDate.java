package it.prova;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	public static Date s2d(String dataString)throws Exception {
		return new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
	}

	public static String d2s(Date data)throws Exception {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}
	
}
