package javalearning;

import java.util.HashMap;
import java.util.Map;

public class JavaIntegerPrograms {

	public void reverseNumber(int number) {
		int revNum=0, newNum=number;	
		while(number%10>0) {
			revNum=revNum*10+number%10;
			number=number/10;
		}
		System.out.println("Given Number: "+newNum +" === Reverse Number: "+revNum);
	}

	public void numbersCount(long number) {
		char[] charArr=Long.toString(number).toCharArray();
		Map<Character, Integer> charCount=new HashMap<Character, Integer>();
		for(int i=0; i<charArr.length;i++) {
			if(charCount.containsKey(charArr[i])) {
				charCount.put(charArr[i], charCount.get(charArr[i])+1);
			}else {
				charCount.put(charArr[i], 1);
			}
		}
		System.out.println("Count of Each Number in :"+number);
		System.out.println(charCount);
	}

	public void swapNumbers(int x, int y) {
		System.out.print("Actual Values of X, Y: "+x+" "+y+"  ===  ");
		y=x+y;
		x=y-x;
		y=y-x;
		System.out.println("Swaped Values of X, Y: "+x+" "+y);
	}
	
	public void primeNumbers(int value) {
		System.out.print("Prime Numbers till "+value+": ");
		for(int i=3;i<=value;i++) {
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
