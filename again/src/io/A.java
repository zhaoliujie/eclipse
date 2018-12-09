package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class A {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	OutputStream os=new FileOutputStream("D:\\f\\d.txt");
	int i=1314520;
	os.write(i);
	os.write(i>>8);
	os.write(i>>16);
	os.write(i>>24);
	System.out.println("完成");
	os.close();
	
	}

}
