package com;


import java.io.FileReader;
import java.io.FileWriter;

public class CharacterWiseFileCopyOperation {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("C:\\Users\\91990\\Desktop\\Cisco Projects\\Grocers-Application\\src\\com\\controller\\LoginController.java");
		FileWriter fw = new FileWriter("Sample2.txt");
		int ch;
		while((ch=fr.read()) != -1) {		//EOF = -1
			fw.write(Character.toUpperCase(ch));
			System.out.print((char)ch);
		}
		
		System.out.println("File copied..");
		fr.close();
		fw.close();
	}

	}


