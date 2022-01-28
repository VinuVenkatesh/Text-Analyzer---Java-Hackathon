package com.cgi.cgihackathon;

import java.util.ArrayList;

public class WordsManipulation {

	//Replaces all unwanted characters from string
	String replaceAll(String words) {
		words = words.replace(",", " ");
		words = words.replace(":", " ");
		words = words.replace(".", " ");
		words = words.replace(";", " ");
		words = words.replace("-", " ");
		return words;
	}

	//Converts String to lower case
	String lowerCase(String words) {
		return words.toLowerCase();
	}

	//Replaces empty spaces in the list of strings
	ArrayList<String> spaceRemoval(ArrayList<String> stringList) {
		boolean space = false;
		space = stringList.remove("");
		while (space) {
			space = stringList.remove("");
		}
		return stringList;
	}
}
