package Day5;
import java.util.Scanner;
public class GitCalculator {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to git calculator");
		System.out.println("Input the desired operation");
		System.out.println("Addition(A) / Subtraction(S) / Multiplication(M) / Division(D)");
		String operation = scan.next();
		System.out.println("Input first integer");
		int number1 = scan.nextInt();
		System.out.println("Input second integer");
		int number2	= scan.nextInt();
		
		if (operation.equalsIgnoreCase("A")) {
			double result = number1 + number2;
      System.out.println(result);
		}
		else if (operation.equalsIgnoreCase("S")) {
			double result = number1 - number2;
			System.out.println(result);
		}
		else if (operation.equalsIgnoreCase("M")) {
			double result = number1 * number2;
      System.out.println(result);
		}
		else if (operation.equalsIgnoreCase("D")) {
			double result = number1 / number2;
      System.out.println(result);
		}
		else {
			System.out.println("Unrecognized");
		}
}