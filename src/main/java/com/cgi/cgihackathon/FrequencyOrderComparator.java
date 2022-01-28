package com.cgi.cgihackathon;

import java.util.Comparator;

public class FrequencyOrderComparator implements Comparator<Word>{

	public int compare(Word o1, Word o2) {
		if(o2.getOccurences() > o1.getOccurences())
			return 1;
		else if(o2.getOccurences() < o1.getOccurences())
			return -1;
		else
			return o1.getWord().compareTo(o2.getWord());
	}

}
