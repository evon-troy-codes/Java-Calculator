import java.util.Scanner;

/*This program adds, subtracts, multiplies, divides, and gets the
remainder of two numbers */
public class Calculator {

	public Calculator() {// Calculator constructor

	}

	public int add(int a, int b) { // add method

		int sum = a + b;

		return sum;

	}

	public int subtract(int a, int b) { // subtract method

		int minus = a - b;

		return minus;

	}

	public int multiply(int a, int b) { // multiply method

		int product = a * b;

		return product;

	}

//divide method
	public int divide(int a, int b) {

		int divided = a / b;

		return divided;

	}

	public int modulo(int a, int b) { // modulus method

		int modulus = a % b;

		return modulus;

	}

	public String header() { // header() method

		for (int x = 0; x <= 60; x++) {
			System.out.print("*");
		}
		System.out.println("\n");
		System.out.println("\t" + "\t" + "\tJava Calculator");
		System.out.println("");
		for (int x = 0; x <= 60; x++) {
			System.out.print("*");

		}
		System.out.println("");

		return null;

	}

	public static void main(String[] args) { // main method

		Calculator myCalculator = new Calculator();

		myCalculator.header();

		System.out.println("\t" + "\t" + "Welcome to the Java Calculator!\n");

		Scanner input = new Scanner(System.in); // Create a Scanner object

		System.out.println("    Enter 1 for +, 2 for -, 3 for *, 4 for /, and 5 for % ");
		int mathOperation = input.nextInt(); // Read user input

		System.out.println("What is the first value that you would like to enter?");

		int firstEntry = input.nextInt(); // Read first integer entry

		System.out.println("What is the second value that you would like to enter?");

		int secondEntry = input.nextInt(); // Read second integer entry

		int selection = mathOperation;

		switch (selection) { // Case block will run depending on the math operation that the user selected

		case 1:
			System.out.println("We will  add " + firstEntry + " and " + secondEntry + ": " + +firstEntry + " + "
					+ secondEntry + " = " + (firstEntry + secondEntry)); // Addition switch case

			break;

		case 2:
			System.out.println("We will  subtract " + firstEntry + " and " + secondEntry + ": " + +firstEntry + " + "
					+ secondEntry + " = " + (firstEntry - secondEntry)); // Subtraction switch case
			break;

		case 3:
			System.out.println("We will multiply " + firstEntry + " and " + secondEntry + ": " + +firstEntry + " + "
					+ secondEntry + " = " + (firstEntry * secondEntry)); // Multiplication switch case
			break;

		case 4:
			System.out.println("We will divide " + firstEntry + " and " + secondEntry + ": " + +firstEntry + " + "
					+ secondEntry + " = " + (firstEntry / secondEntry)); // Division switch case
			break;

		case 5:
			System.out.println("We will get the remainder of " + firstEntry + " and " + secondEntry + ": " + +firstEntry
					+ " + " + secondEntry + " = " + (firstEntry % secondEntry)); // modulus switch case
			break;

		default:
			System.out.println("Please enter a valid selection to begin arithmetic operations");

		}

		System.out.println("\nThank you for using the java calculator!");

	}

}
