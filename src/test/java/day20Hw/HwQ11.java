package day20Hw;

public class HwQ11 {
	public static void main(String[] args) {
		HwQ11 obj = new HwQ11();

		String resultOne = obj.threeEqual("Java Pro", 'P', 'B');
		String resultTwo = obj.threeEqual("Lazy mode", 'm', 'C');
		String resultThree = obj.threeEqual("Training", 'T', ' ');

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";

		result = str.replace(oldChar, newChar);

		return result;

	}
}
