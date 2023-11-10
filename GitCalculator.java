package Day5;

import java.util.Scanner;

public class GitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to git calculator");
		System.out.println("Input the desired operation");
		System.out.println("Addition(A)/Subtraction(S)/Multiplication(M)/Division(D)");
		String operation = scan.next();
		System.out.println("Input first integer");
		int number1 = scan.nextInt();
		System.out.println("Input second integer");
		int number2	= scan.nextInt();
		
		if (operation.equalsIgnoreCase("A")) {
			
		}
		else if (operation.equalsIgnoreCase("S")) {
			
		}
		else if (operation.equalsIgnoreCase("M")) {
			
		}
		else if (operation.equalsIgnoreCase("D")) {
			
		}
		else {
			System.out.println("Unrecognized");
		}
		}
	public static void bondMultiplication(int n1, int n2) {
		int result = n1*n2;
		System.out.println("Answer: " + result);
	}
	public static void bondDivision (int n1, int n2) {
		int result = n1/n2;
		System.out.println("Answer: " + result);
	}
}
