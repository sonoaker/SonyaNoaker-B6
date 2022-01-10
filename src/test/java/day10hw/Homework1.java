package day10hw;

public class Homework1 {

	public static void main(String[] args) {

		calculate(2.0, 4.0, ' ');
	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		double result = numOne + numTwo;
		System.out.println(numOne + numTwo);

		double result1 = numOne - numTwo;
		System.out.println(numOne - numTwo);

		double result2 = numOne / numTwo;
		System.out.println(numOne / numTwo);

		double result3 = numOne * numTwo;
		System.out.println(numOne * numTwo);

		double result4 = numOne % numTwo;
		System.out.println(numOne % numTwo);
		
		double result5 ;
	    System.out.println("Error Message");

	}
}