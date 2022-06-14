package tugas2;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Scanner input = new Scanner(System.in);

	    System.out.println("Choose an operator +, -, *, or / : ");
	    calculator.operator = input.next().charAt(0);
	    
	    try {
	    	System.out.println("Input first number : ");
	    	calculator.number1 = input.nextInt();
		} catch (Exception e) {
			e.getMessage();
		}
	    
	    try {
	    	System.out.println("Input second number : ");
	    	calculator.number2 = input.nextInt();
		} catch (Exception e) {
			e.getMessage();
		}
    	
    	switch (calculator.operator) {
		case '+':
			calculator.sum(calculator.number1, calculator.number2);
			break;
		case '-':
			calculator.substract(calculator.number1, calculator.number2);
			break;
		case '*':
			calculator.multiply(calculator.number1, calculator.number2);
			break;
		case '/':
			calculator.divided(calculator.number1, calculator.number2);
			break;
		default:
			System.out.println("Invalid operator!");
			break;
		}
    	
    	input.close();
	   
	}

}
