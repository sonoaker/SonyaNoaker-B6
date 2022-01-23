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

		char lastChar = strOne.charAt(strOne.length() - 1);
		char firstChar = strTwo.charAt(0);
		if (lastChar == firstChar) {
			result = strOne.concat(strTwo.substring(1));
		} else {
			result = strOne.concat(strTwo);
		}

		return result;

	}

	/**
	 * 
	 * Write a method to concatenate two given strings such that, if the
	 * concatenation creates a double characters then removes one of the characters.
	 *
	 * a. For example strOne = "food"; strTwo = "door". After concatenating two
	 * strings it will give us "fooddoor" (dd is double character, remove one of the
	 * d) then the string concatenation are: "fooddoor"
	 *
	 * Access Modifier: default Non-Access Modifier: non-static Return type: String
	 * Method Name: concatString Parameter1: String strOne Parameter2: String strTwo
	 *
	 * TestData: concatString("Java","awesome") -- javawesome concatString("food",
	 * "door") -- foodoor concatString("java","training") -- javatraining
	 * concatString ("Pro", "ogress")-- Progress
	 */
}
