package com.training.maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TranslateService {

	private Hashtable<String, String>hindiToEnglish;

	public TranslateService() {
		hindiToEnglish = new Hashtable<String,String>();
		init();
	}

	public void init(){
		hindiToEnglish.put("ek", "one");
		hindiToEnglish.put("do", "two");
		hindiToEnglish.put("teen", "three");
	}
	
	public String findEnglishWord(String hindiWord) {
		return hindiToEnglish.get(hindiWord);
	}
	
	public  void printWords() {
	Set<Map.Entry<String, String>>list = hindiToEnglish.entrySet();
	for (Map.Entry<String, String> words : list) {
		System.out.println(words.getKey()+" : "+words.getValue());
		
	}
	}
	
	public static void main(String[] args) {
		
		TranslateService translateService = new TranslateService();
		System.out.println(translateService.findEnglishWord("ek"));
		translateService.printWords();
		
	}
	
}
