/**
 * @author johnpaulthomas
 * Application class for testing strings for Palindromes by user input
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	/*
	 * Asking the user for a string to test as a palindrome
	 */
	System.out.println("Please enter the string to be tested as a palindrome: ");
	
	String palindromeTest = s.nextLine();
	/**
	 * converting user string to an array of char [] 
	 * 
	 * For loop iterates over the array indexing each character of the string starting with 0
	 * 
	 */
	char [] ch = palindromeTest.toCharArray();
	for (int i = 0; i<ch.length;i++) {
		
	}//end for loop
	//List<char[]> asList = Arrays.asList(ch);
	/**
	 * Instantiating a new ArrayStack<> stringStack
	 * 
	 * for loop iterates over the char [] ch and pushes its elements into the stack starting at the bottom
	 * 
	 */
	ArrayStack <Character>	stringStack = new ArrayStack<Character>();
	for (char c : ch) {
		stringStack.push(c);
	}//end for loop
	
	System.out.println(stringStack);
	/**
	 * Instantiating a new ArrayStack<> stringStack2 which will be the reverse order of stringStack
	 * 
	 */
	ArrayStack<Character> stringStack2 = new ArrayStack<>();
	/**
	 * while loop for popping elements from the top of stringStack and pushing them to the 
	 * bottom of stringStack2
	 * 
	 */
	while (!stringStack.isEmpty()) {
		stringStack2.push(stringStack.pop());
		
	}//end while loop
	
	System.out.println(stringStack2);
	/**
	 * Using string builder to convert stringStack2 to a string before converting
	 * to a char [] array
	 */
	List<ArrayStack<Character>> list = Arrays.asList(stringStack2);
	StringBuilder sb = new StringBuilder();
	for (ArrayStack<Character> ch2 : list) {
		sb.append(ch2);
		
	}//end for loop
	/**
	 * Converting the string representation of stringStack2 to a char [] array 
	 * 
	 */
	String palindromeTest2 = sb.toString();
	char [] ch2 = palindromeTest2.toCharArray();
	/**
	 * using Arrays.equals to test the char [] arrays for equality 
	 */
	boolean return1 = Arrays.equals(ch, ch2);
	System.out.println("Is this a palindrome? "+return1);
	/**
	 * looping through the indexes of both arrays to test for equality
	 * 
	 */
	 Boolean equal=true;
	    for(int i=0;i<ch.length;++i) {
	        if(ch[i]!=ch2[i]) {
	            equal=false;
	            break;
	        }//end if statement
	    }//end for loop
	
	System.out.println("Is this a palindrome? "+equal);
	
	
	}//end main method

}//end class
