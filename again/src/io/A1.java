package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class A1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
InputStream is=new FileInputStream("D:\\f\\d.txt");
System.out.println(is.read()+(is.read()<<8)+(is.read()<<16)+(is.read()<<24));
is.close();



	}

}
