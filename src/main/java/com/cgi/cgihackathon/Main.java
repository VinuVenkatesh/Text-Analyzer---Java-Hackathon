package com.cgi.cgihackathon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		Sorting s = new Sorting();
		String words = new FileReading().fReader("data/daffodils.txt");
		ArrayList<Word> wordObjList = mainObj.caseSensitiveList(words);
		ArrayList<Word> wordObjLowerCaseList = mainObj.lowerCaseWordList(words);
		System.out.println("Sorted case sensitive word list");
		mainObj.showWordList(wordObjList);
		System.out.println("Sorted lower case word list");
		mainObj.showWordList(wordObjLowerCaseList);
		System.out.println("Reverse order case sensitive word list");
		mainObj.showWordList(s.reverseOrder(wordObjList));
		System.out.println("Reverse order lower case word list");
		mainObj.showWordList(s.reverseOrder(wordObjLowerCaseList));
		System.out.println("Frequent case sensitive word list");
		mainObj.showWordList(s.showFrequentWords(wordObjList));
		System.out.println("Frequent lower case word list");
		mainObj.showWordList(s.showFrequentWords(wordObjLowerCaseList));
	}

	void showWordList(ArrayList<Word> wordObjList) {
		for (Word word : wordObjList) {
			System.out.println(word.toString());
		}
	}

	ArrayList<Word> wordListCreation(ArrayList<String> list) {
		ArrayList<Word> wordObjList = new ArrayList<Word>();
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.addAll(list);
		for (String string : tSet) {
			int count = Collections.frequency(list, string);
			int size = string.length();
			wordObjList.add(new Word(count, size, string));
		}
		return wordObjList;
	}

	ArrayList<Word> lowerCaseWordList(String words) {
		WordsManipulation wM = new WordsManipulation();
		Main mainObj = new Main();
		ArrayList<String> stringListLowerCase;
		ArrayList<Word> wordObjLowerCaseList = new ArrayList<Word>();
		String wordsLowerCase = wM.lowerCase(words);
		wordsLowerCase = wM.replaceAll(wordsLowerCase);
		stringListLowerCase = wM.spaceRemoval( new ArrayList<String>(Arrays.asList(wordsLowerCase.split(" "))));
		wordObjLowerCaseList = mainObj.wordListCreation(stringListLowerCase);
		return wordObjLowerCaseList;
	}
	ArrayList<Word> caseSensitiveList(String words) {
		WordsManipulation wM = new WordsManipulation();
		Main mainObj = new Main();
		ArrayList<String> stringList;
		ArrayList<Word> wordObjList = new ArrayList<Word>();
		words = wM.replaceAll(words);
		stringList = wM.spaceRemoval( new ArrayList<String>(Arrays.asList(words.split(" "))));
		wordObjList = mainObj.wordListCreation(stringList);
		return wordObjList;
	}
}
