package javalearning;

public class JavaStringPrograms {

	
	public void stringReverse(String str) {
		String revString="";
		char[] charArr=str.toCharArray();
		for(char c : charArr) {
			revString=c+revString;
		}
		System.out.println("Given String: "+str +"=== Reverse String: "+revString);
	}
}
