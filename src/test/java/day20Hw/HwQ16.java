package day20Hw;

public class HwQ16 {

	public static void main(String[] args) {

		HwQ16 obj = new HwQ16();

		String resultOne = obj.concatString("java", "awesome");
		String resultTwo = obj.concatString("food", "door");
		String resultThree = obj.concatString("java", "training");
		String resultFour = obj.concatString("Pro", "ogress");

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

	String concatString(String strOne, String strTwo) {
		String result = " ";

		result = strOne.concat(strTwo);

		return result;

	}
}
