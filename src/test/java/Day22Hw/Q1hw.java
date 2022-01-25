package Day22Hw;

public class Q1hw {

	public static void main(String[] args) {

		Q1hw obj = new Q1hw();

		String resultOne = obj.toUpper("Pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper(null);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	String toUpper(String strOne) {
		String result = " ";

		if (strOne == null) {
			result = "null";

		} else {
			result = strOne.toUpperCase();
		}

		return result;
	}
}
