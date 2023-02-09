/*This program adds, subtracts, multiplies, divides, and gets the
remainder of two numbers */
public class Calculator {
//Calculator constructor
	public Calculator() {

	}
//add method
	public int add(int a, int b) {

		int sum = a + b;

		return sum;

	}
//subtract method
	public int subtract(int a, int b) {

		int minus = a - b;

		return minus;

	}
//multiply method
	public int multiply(int a, int b) {

		int product = a * b;

		return product;

	}
//divide method
	public int divide(int a, int b) {

		int divided = a / b;

		return divided;

	}
//modulus method
	public int modulo(int a, int b) {

		int modulus = a % b;

		return modulus;

	}
//main method
	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();

		System.out.println(myCalculator.add(5, 7));
		System.out.println(myCalculator.subtract(45, 11));

	}

}
