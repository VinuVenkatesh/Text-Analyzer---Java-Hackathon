package com.cgi.cgihackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class WordList {

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
		ArrayList<String> stringListLowerCase;
		ArrayList<Word> wordObjLowerCaseList = new ArrayList<Word>();
		String wordsLowerCase = wM.lowerCase(words);
		wordsLowerCase = wM.replaceAll(wordsLowerCase);
		stringListLowerCase = wM.spaceRemoval(new ArrayList<String>(Arrays.asList(wordsLowerCase.split(" "))));
		wordObjLowerCaseList = wordListCreation(stringListLowerCase);
		return wordObjLowerCaseList;
	}

	ArrayList<Word> caseSensitiveList(String words) {
		WordsManipulation wM = new WordsManipulation();
		ArrayList<String> stringList;
		ArrayList<Word> wordObjList = new ArrayList<Word>();
		words = wM.replaceAll(words);
		stringList = wM.spaceRemoval(new ArrayList<String>(Arrays.asList(words.split(" "))));
		wordObjList = wordListCreation(stringList);
		return wordObjList;
	}
}
