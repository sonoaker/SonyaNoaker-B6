package com.noorteck.java.hw6;

public class Day12Hw2 {

	public static void main(String[] args) {
		boolean result = multipleOf(3);
		boolean resultTwo = multipleOf(10);
		boolean resultThree = multipleOf(8);

		System.out.println(result);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}

	public static boolean multipleOf(int z) {
		boolean result = false;

		if ((z % 3 == 0) || (z % 5 == 0)) {
			result = true;

		} else {
			result = false;
		}

		return result;
	}

}