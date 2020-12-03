package com.simplilearn.workshop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// update operation
public class TextFileModificationProgram {

	public static void main(String[] args) {
		updateFile("file1","This is my second line","This is my UPDATED second line");
		System.out.println("done");
	}
	public static void updateFile (String filepath, String oldString, String newString) {
		File filetobeupdated = new File(filepath);
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(filetobeupdated));
			String line = reader.readLine();
			while(line != null) {
				oldContent = oldContent + line + System.lineSeparator();
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);
			
			writer = new FileWriter(filetobeupdated);
			writer.write(newContent);
			
		} catch (IOException e) {
			// handle exception
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e)  {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}

}
