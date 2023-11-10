package Day5;
import java.util.Scanner;
public class DMCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your first number? ");
        int firstNumber = sc.nextInt();
        System.out.print("What's your second number? ");
        int secondNumber = sc.nextInt();

        System.out.print("What operation would you like? Addition, subtraction, multiplication or division? (+, -, *, /) ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }

    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if( secondNumber != 0){
                    result = firstNumber/secondNumber;
                }else{
                    System.out.println("Invalid operation: you can't divide by zero, silly!");
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}
