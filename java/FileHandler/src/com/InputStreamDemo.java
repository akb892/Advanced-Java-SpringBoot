package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		
		byte b[] = new byte[87];
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ARBARNWA\\Downloads\\New Text Document.txt");
			fis.read(b);
			System.out.println(b);
			fis.close();
			FileOutputStream fos = new FileOutputStream("C:\\Users\\ARBARNWA\\Downloads\\copy New Text Document.txt");
			fos.write(b);
			System.out.println("Done....");
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}