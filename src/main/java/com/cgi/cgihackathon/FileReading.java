package com.cgi.cgihackathon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	String fReader(String fileName) throws IOException {
		BufferedReader bR = new BufferedReader(new FileReader(fileName));
		String read = bR.readLine();
		String words = "";
		while (read != null) {
			words += read;
			read = bR.readLine();
		}
		bR.close();
		return words;
	}

}
