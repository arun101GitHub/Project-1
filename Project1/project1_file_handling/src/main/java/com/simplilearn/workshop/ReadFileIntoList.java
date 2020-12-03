package com.simplilearn.workshop;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {

	public static void main(String[] args) {
		List<String> results = readFileinList("testfile4.txt");
		
		Iterator<String> i = results.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static List<String> readFileinList(String fileName) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}


}
