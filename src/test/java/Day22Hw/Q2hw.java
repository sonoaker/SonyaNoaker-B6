package Day22Hw;

public class Q2hw {

	public static void main(String[] args) {
		Q2hw obj = new Q2hw();

		System.out.println(obj.isEndWith("java training", "ing"));
		System.out.println(obj.isEndWith("java training", "ng"));
		System.out.println(obj.isEndWith("java training", "java"));
		System.out.println(obj.isEndWith("java training", "train"));
		System.out.println(obj.isEndWith(null, "java"));
		System.out.println(obj.isEndWith(null, null));
		System.out.println(obj.isEndWith("aaabc", "abc"));
		System.out.println(obj.isEndWith("abc", null));
	}

	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;

		if (strOne != null && strTwo != null) {
			result = strOne.endsWith(strTwo);

		}
		return result;

	}

}
