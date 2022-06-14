package tugas2;

public class Calculator {
	
	Character operator;
	
	Integer number1 = 0;
	Integer number2 = 0;
	Integer result = 0;
	
	public void sum(Integer number1, Integer number2) {
		result = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + result);
	}
	
	public void substract(Integer number1, Integer number2) {
		result = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + result);
	}
	
	public void multiply(Integer number1, Integer number2) {
		result = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + result);
	}
	
	public void divided(Integer number1, Integer number2) {
		result = number1 / number2;
		System.out.println(number1 + " : " + number2 + " = " + result);
	}
	
}
