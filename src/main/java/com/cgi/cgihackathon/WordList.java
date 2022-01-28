package com.cgi.cgihackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

//Class that does anything related to the word list such as printing and creating
public class WordList {

	void showWordList(ArrayList<Word> wordObjList) {
		for (Word word : wordObjList) {
			System.out.println(word.toString());
		}
	}

	//This method creates the wordList
	ArrayList<Word> wordListCreation(ArrayList<String> list) {
		ArrayList<Word> wordObjList = new ArrayList<Word>();
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.addAll(list); //Removes all duplicates and sorts by natural ordering
		for (String string : tSet) {
			int count = Collections.frequency(list, string); //Counts the number of occurrences of a word and stores in count
			int size = string.length();
			wordObjList.add(new Word(count, size, string)); //Creates a new Word object using a parameterized constructor and stores in the list
		}
		return wordObjList;
	}

	ArrayList<Word> lowerCaseWordList(String words) {
		WordsManipulation wM = new WordsManipulation();
		ArrayList<String> stringListLowerCase;
		ArrayList<Word> wordObjLowerCaseList = new ArrayList<Word>();
		String wordsLowerCase = wM.lowerCase(words); //makes the words all lower case
		wordsLowerCase = wM.replaceAll(wordsLowerCase); //Replaces all characters
		stringListLowerCase = wM.spaceRemoval(new ArrayList<String>(Arrays.asList(wordsLowerCase.split(" ")))); //Stores array into a list and then removes all empty strings
		wordObjLowerCaseList = wordListCreation(stringListLowerCase); //Create list of words using above list of strings
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
