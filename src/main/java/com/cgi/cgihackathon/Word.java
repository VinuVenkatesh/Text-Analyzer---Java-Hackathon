package com.cgi.cgihackathon;

public class Word {
	private int occurences;
	private int size;
	private String word;

	public Word(int occurences, int size, String word) {
		super();
		this.occurences = occurences;
		this.size = size;
		this.word = word;
	}

	public int getOccurences() {
		return occurences;
	}

	@Override
	public String toString() {
		return "Word = " + word + ", Occurences = " + occurences + ", Size = " + size;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public void setOccurences(int occurences) {
		this.occurences = occurences;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
