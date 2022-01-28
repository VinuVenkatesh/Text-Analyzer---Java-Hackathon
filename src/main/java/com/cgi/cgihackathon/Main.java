package com.cgi.cgihackathon;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		WordList wordListObj = new WordList();
		Sorting s = new Sorting();
		String words = new FileReading().fReader("data/daffodils.txt");
		ArrayList<Word> wordObjList = wordListObj.caseSensitiveList(words);
		ArrayList<Word> wordObjLowerCaseList = wordListObj.lowerCaseWordList(words);
		System.out.println("Sorted case sensitive word list");
		wordListObj.showWordList(wordObjList);
		System.out.println("Sorted lower case word list");
		wordListObj.showWordList(wordObjLowerCaseList);
		System.out.println("Reverse order case sensitive word list");
		wordListObj.showWordList(s.reverseOrder(wordObjList));
		System.out.println("Reverse order lower case word list");
		wordListObj.showWordList(s.reverseOrder(wordObjLowerCaseList));
		System.out.println("Frequent case sensitive word list");
		wordListObj.showWordList(s.showFrequentWords(wordObjList));
		System.out.println("Frequent lower case word list");
		wordListObj.showWordList(s.showFrequentWords(wordObjLowerCaseList));
	}

}
