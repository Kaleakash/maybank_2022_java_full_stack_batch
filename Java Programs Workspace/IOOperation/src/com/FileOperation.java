package com;

import java.io.File;

public class FileOperation {

	public static void main(String[] args) throws Exception{
		// directory path
			File ff1 = new File("C:\\Users\\91990\\Desktop\\File Info");
		System.out.println(ff1.getAbsolutePath());
		System.out.println(ff1.isDirectory());
		System.out.println(ff1.isFile());
			String listOfFiles[] = ff1.list();
			System.out.println("Number of files "+listOfFiles.length);
			for(String fname : listOfFiles) {
				System.out.println("File name is "+fname);
			}
			File ff2 = new File("C:\\Users\\91990\\Desktop\\File Info\\test.txt");
			System.out.println(ff2.getAbsolutePath());
			System.out.println(ff2.isDirectory());
			System.out.println(ff2.isFile());
			System.out.println("Size of the file "+ff2.length());
			System.out.println("Can we read "+ff2.canRead());
			System.out.println("Can we write "+ff2.canWrite());
			System.out.println("File present or not "+ff2.exists());
			System.out.println("Current file directory path "+ff2.getParent());
//			String listOfFiles1[] = ff2.list();
//			System.out.println("Number of files "+listOfFiles1.length);
	}

}
