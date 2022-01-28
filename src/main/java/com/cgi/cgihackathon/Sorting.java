package com.cgi.cgihackathon;

import java.util.ArrayList;
import java.util.Collections;

//Class to sort by reverse order and frequency
public class Sorting {

	ArrayList<Word> reverseOrder(ArrayList<Word> wordObj) {
		Collections.sort(wordObj, new ReverseOrderComparator());
		return wordObj;
	}

	ArrayList<Word> showFrequentWords(ArrayList<Word> wordObj) {
		Collections.sort(wordObj, new FrequencyOrderComparator());
		return wordObj;
	}
}
