package day20Hw;

public class Q8Hw {
	public static void main(String[] args) {

		String str = "java training";

		System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(8));
		System.out.println(str.charAt(22));

	}

	static char getCharacter(String strOne, int indexNum) {

		char result = ' ';
		result = strOne.charAt(indexNum);

		return result;
	}

}

