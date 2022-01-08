package com.noorteck.java.hw6;

public class DoubleTotal {

	public static void main(String[] args) {

		int myTotal = sumDouble(1, 2);
		int myTotalOne = sumDouble(3, 2);
		int myTotalTwo = sumDouble(2, 2);

		System.out.println(myTotal);
		System.out.println(myTotalOne);
		System.out.println(myTotalTwo);
	}

	public static int sumDouble(int valueOne, int valueTwo) {
		int result = 0;
		result = valueOne + valueTwo;
		if (valueOne == valueTwo) {
			result = (result * 2);

		} else if (valueOne != valueTwo) {
			result = valueOne + valueTwo;

		}
		return result;
	}
}
