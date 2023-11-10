package Day5;

import java.util.Scanner;

public class GitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to git calculator");
		System.out.println("Input the desired operation");
		System.out.println("Addition(A)/Subtraction(S)/Multiplication(M)/Division(D)/Indices(I)");
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
		else if (operation.equalsIgnoreCase("I")){
			System.out.println("Enter Indice");
			int power = scan.nextInt();
			System.out.println("1 or 2?");
			int num = scan.nextInt();
			if(num == 1){
				System.out.println(Math.pow(number1, power));
			}else{
				System.out.println(Math.pow(number2, power));
			}
		}else {
			System.out.println("Unrecognized");
		}
		}

}