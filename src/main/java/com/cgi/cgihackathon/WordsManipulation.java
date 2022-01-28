package com.cgi.cgihackathon;

import java.util.ArrayList;

public class WordsManipulation {

	String replaceAll(String words) {
		words = words.replace(",", " ");
		words = words.replace(":", " ");
		words = words.replace(".", " ");
		words = words.replace(";", " ");
		words = words.replace("-", " ");
		return words;
	}

	String lowerCase(String words) {
		return words.toLowerCase();
	}

	ArrayList<String> spaceRemoval(ArrayList<String> stringList) {
		boolean space = false;
		space = stringList.remove("");
		while (space) {
			space = stringList.remove("");
		}
		return stringList;
	}
}
