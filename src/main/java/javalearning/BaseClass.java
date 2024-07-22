package javalearning;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaIntegerPrograms jip=new JavaIntegerPrograms();
		JavaStringPrograms jsp=new JavaStringPrograms();
		System.out.println();
		System.out.println("================================= Integer Programs =================================");
		System.out.println();
		jip.reverseNumber(123456789);
		jip.numbersCount(1232694891);
		jip.swapNumbers(10, 20);
		jip.primeNumbers(100);
		System.out.println();
		System.out.println("================================= String Programs =================================");
		System.out.println();
		jsp.stringReverse("prasad");
		jsp.countOfCharactersInString("Hello World Welcome to Java And Learn Java ");
		System.out.println();
	}

}
