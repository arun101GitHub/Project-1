package com.simplilearn.workshop;

import java.io.File;
import java.io.IOException;

public class CurrentDirectoryPath {
	public void findDirectory() {
        try {
            String canonicalPath = new File(".").getCanonicalPath();
            System.out.println("Current directory path using canonical path method :- " + canonicalPath);
 
            String usingSystemProperty = System.getProperty("user.dir");
            System.out.println("Current directory path using system property:- " + usingSystemProperty);
 
        } catch (IOException e) {
            System.out.println("IOException Occured" + e.getMessage());
        }
    }

}
