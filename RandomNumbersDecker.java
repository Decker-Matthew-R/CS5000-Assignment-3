
public class RandomNumbersDecker 
{
	
	//Main Method
	public static void main (String [] args)
	{
		//This code introduces the program to the user
		System.out.println ("This program will randomly generate a series of numbers given certain perameters.");
		System.out.println (" ");
		
		//Introduces Variables
		int a = 20 + (int)(Math.random()* (61));
		int b = -20 + (int)(Math.random() * (41));
		int c = -50 + (int)(Math.random() * (31));
		float d = 0 + (float)(Math.random() * 22);
		
		//Print Part A
		System.out.println ("a) A random integer between 20 and 80 (inclusive): \t " + a); 

		//Print Part B
		System.out.println ("b) A random integer between -20 and 20 (inclusive): \t " + b);
		
		//Print Part C
		System.out.println ("c) A random integer between -50 and -20 (inclusive): \t " + c);
		
		//Print Part D
		System.out.println ("d) A random integer between 0.0 and 21.9999 (inclusive): " + d);	
		
	}

}
