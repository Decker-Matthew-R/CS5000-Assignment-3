//Import Scanner Utility
import java.util.Scanner;

public class StringMethodsDecker 
{
	//Main Method
	public static void main (String[] args)
	{
		//Assign Scanner Input
		Scanner input = new Scanner(System.in);
		
		//Introduce program to user
		System.out.println("This program will prompt you to enter two lines of string");
		System.out.println("");
		//Prompt user to enter the first string
		System.out.print("Please enter the first string: ");
		String string_1 = input.next();
		//Prompt user to enter the second string
		System.out.print("Please enter the second string: ");
		String string_2 = input.next();
		//Create a break between inputs and outputs
		System.out.println("");
		
		
		//Print String lenth for String 1 and String 2
		System.out.println("a) Length of String 1: \t" + string_1.length() + " characters");
		System.out.println("b) Length of String 2: \t" + string_2.length() + " characters");
		//Concat String 1 and String 2
		System.out.println("c) Concatenation: \t" + string_1 + " " + string_2);
		// If than statement for evaluating if the strings are equal to eachother
		if (string_1.equals(string_2))
			System.out.println("d) Equal Strings?:\tEqual");
		else 
			System.out.println("d) Equal Strings?:\tNot Equal");
		//Converting String 1 and String 2 to upper and lower case
		System.out.println("e) Uppercase String 1: \t" + string_1.toUpperCase());
		System.out.println("f) Lowercase String 2: \t" + string_2.toLowerCase());
		//Extracting a substring from String 1
		System.out.println("g) Valid Substring: \t" + string_1.substring(1,3));
	}

}
