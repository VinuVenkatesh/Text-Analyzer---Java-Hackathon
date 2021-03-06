package com.cgi.cgihackathon;

import java.util.Comparator;

//Comparator to sort by descending order of words
public class ReverseOrderComparator implements Comparator<Word> {

	public int compare(Word o1, Word o2) {
		return o2.getWord().compareTo(o1.getWord());
	}

}
