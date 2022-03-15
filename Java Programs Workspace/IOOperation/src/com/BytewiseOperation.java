package com;

//import java.io.DataInputStream;
//import java.io.FileOutputStream;
import java.io.*;
public class BytewiseOperation {

	public static void main(String[] args) throws Exception{
	DataInputStream dis = new DataInputStream(System.in);
	FileOutputStream fos = new FileOutputStream("abc.txt");	// override the data 
	//FileOutputStream fos = new FileOutputStream("abc.txt",true); // append the data 
	System.out.println("Enter the text");
	int ch;
	while((ch=dis.read()) != '@') {
			fos.write(ch);
			System.out.print(ch +" "+(char)ch);
	}
			fos.write('\n');
	}

}
