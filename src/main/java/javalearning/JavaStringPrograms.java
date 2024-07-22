package javalearning;

import java.util.HashMap;
import java.util.Map;

public class JavaStringPrograms {

	
	public void stringReverse(String str) {
		String revString="";
		char[] charArr=str.toCharArray();
		for(char c : charArr) {
			revString=c+revString;
		}
		System.out.println("Given String: "+str +" === Reverse String: "+revString);
	}
	
	public void countOfCharactersInString(String str) {
		char[] charArr=str.toCharArray();
		Map<Character, Integer> charCount=new HashMap<Character, Integer>();
		for(int i=0; i<charArr.length;i++) {
			if(charCount.containsKey(charArr[i])) {
				charCount.put(charArr[i], charCount.get(charArr[i])+1);
			}else {
				charCount.put(charArr[i], 1);
			}
		}
		System.out.println("Count of Each Character in :"+str);
		System.out.println(charCount);
	}

	

}
