package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseFileCopy {

	public static void main(String[] args) throws Exception{
		//FileInputStream fis = new FileInputStream("abc.txt");
		FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\Cisco Projects\\Grocers-Application\\src\\com\\controller\\LoginController.java");
		FileOutputStream fos = new FileOutputStream("Sample1.txt");
		int ch;
		while((ch=fis.read()) != -1) {		//EOF = -1
			fos.write(Character.toUpperCase(ch));
			System.out.print((char)ch);
		}
		
		System.out.println("File copied..");
		//fis.close();
		//fos.close();
	}

}
