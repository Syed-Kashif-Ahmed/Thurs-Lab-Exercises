package javaexamples;

public class StringFunctions {
	public static void main(String[] args) {
		String s1=" Shahrukh ";
		System.out.println("The concatenation function.\n "+s1.concat("Khan"));
		//Joins to strings
		System.out.println("Removing spaces from the string.\n"+s1.trim());
		//Removes spaces.
		System.out.println("Converting all letters to uppercase.\n"+s1.toUpperCase());
		//Converts the string to Capital Letters.
		System.out.println("Converting all letters to lowercase.\n"+s1.toLowerCase());
		//Converts the string to small letters.
		System.out.println("Printing the character present at position 1.\n"+s1.charAt(1));
		//prints the character present at index 1
		System.out.println("Printing the index or position for the given letter.\n"+s1.indexOf("r"));
		//prints the position of the letter r.
	}
}
