package Day11Hw;

public class Subtraction {
	public static void main(String[] args) {
		int diffTotal = difference21(19);
		int diffTotalOne = difference21(10);
		int diffTotalTwo = difference21(30);
		int diffTotalThree = difference21(21);

		System.out.println(diffTotal);
		System.out.println(diffTotalOne);
		System.out.println(diffTotalTwo);
		System.out.println(diffTotalThree);
	}

	public static int difference21(int number) {
		int result = 0;

		if (number <= 21) {
			result = number - 21;

		} else {
			result = (number - 21) * 2;

		}
		return result;
	}
}
