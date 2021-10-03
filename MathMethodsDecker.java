//Import scanner utility
import java.util.Scanner;

public class MathMethodsDecker 
{
	//Main Method
	public static void main (String[] args)
	{
		//Set Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Solve for Absolute Value
		System.out.print("Enter a negative integer: \t");
		int integer = input.nextInt();
		System.out.println("The absolute value of " + integer + " is: \t" + Math.abs(integer));
		System.out.println("");
		
		//Solve for Sine, Cosine, Tangent of Angle
		System.out.print("Enter a floating point number representing an angle: ");
		float floating = input.nextFloat();
		System.out.println("The cosine of this angle is: \t" + Math.cos(floating));
		System.out.println("The sine of this angle is: \t" + Math.sin(floating));
		System.out.println("The tangent of this angle is: \t" + Math.tan(floating));
		System.out.println("");
		
		//Determine the Floor and Ceiling value of a number
		System.out.print("Enter a floating point number: \t");
		float floating1 = input.nextFloat();
		System.out.println("The floor value of " + floating1 + " is: \t" + Math.floor(floating1));
		System.out.println("The ceiling value of " + floating1 + " is: \t" + Math.ceil(floating1));
		System.out.println("");
		
		//Determine a number to a power of another number
		System.out.print("Enter a floating point number as X: \t");
		float floatingx = input.nextFloat();
		System.out.print("Enter a floating point number as Y: \t");
		float floatingy = input.nextFloat();
		System.out.println("The value of " + floatingx + "^" + floatingy + " is: \t\t" + Math.pow(floatingx, floatingy));
		System.out.println("");
		
		System.out.print("Enter an Integer Number: \t");
		int squareint = input.nextInt();
		System.out.println("The Square root of " + squareint + " is \t" + Math.sqrt(squareint));
		
	}
}
