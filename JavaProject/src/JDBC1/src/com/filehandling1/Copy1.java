package com.filehandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("e:/File_han/File2.txt");
		File f1=new File("e:/File_han/File3.txt");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f1);
		byte arr[]=new byte[fis.available()];
		fis.read(arr);
		
		fos.write(arr, 0, 15);
		
		
		
		
		
	}

}
