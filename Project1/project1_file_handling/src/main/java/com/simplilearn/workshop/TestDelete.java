package com.simplilearn.workshop;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class TestDelete {

	public static void delete() {
		try {
			Files.delete(Paths.get("file2"));
		} catch (NoSuchFileException e) {
			System.out.println("No such file");
		} catch(DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Deletion Successful");
	}

}
