import java.util.Scanner;

//	Create a MagicCalculator that inherits its basic functionality from your calculator and does the following functions:
//	Finds the square root of a number
//	Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
//	Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
//	Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
//	Finds the factorial (!) of the number
	
	//magic calculator extending calculator class
	public class MagicCalculator extends Calculator 
	{
		//factorial method
		public static int factorial(int n)
		{
			return (n == 1 || n == 0) ? 1 : n * factorial (n-1);
		}
		
		//main functionality
		public static void main (String[] args) {
		
		//object of calculator class
		Calculator calculator = new Calculator ();
			
		//scanner class to take input
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number: ");
		
		int num = sc.nextInt ();
		
		//calling square method
		int sq = calculator.square(num);
		
		System.out.println("The square root of " + num + " is: " + sq);
		
		//Enter in degrees then converting to radians
		System.out.print("Enter angle in degrees :");
		double degree = sc.nextDouble();
		double radians = Math.toRadians(degree);
		
		System.out.println("Sin is: " + Math.sin(radians));
		System.out.println("Cosine is: " + Math.cos(radians));
		System.out.println ("Tangent is: " + Math.tan (radians));
		System.out.println("Factorial of " + num + " is: " + factorial (num));
		}
	}

