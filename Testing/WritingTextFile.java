package org.manish.Testing;

import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFile {
	 public static void main(String[] args) {
		 String str =
				 "<hasp_info>"+
						"hello";
	        try {
	            FileWriter writer = new FileWriter("MyFile.txt", true);
	            writer.write(str);
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
}

