package Day24Hw;

public class Q7 {

	public static void main(String[] args) {
		int[] n1 = { 88, 22, 6, 1, 2, 3, 88, 22, 44, 33 };
		System.out.println(getIndexNumber(n1, 3));

		int[] n2 = { 1, 2, 3, 22, 44, 33 };
		System.out.println(getIndexNumber(n2, 12));

		int[] n3 = { 88, 22, 6, 1, 8, 0 };
		System.out.println(getIndexNumber(n3, 22));

		int[] n4 = { 2, 3, 88, 22, 44 };
		System.out.println(getIndexNumber(n4, 44));

	}

	public static int getIndexNumber(int[] number, int elementValue) {
		int result = -1;
		for (int i = 0; i < number.length; i++) { //when we dont know the position

			if (number[i] == elementValue) {// i is each element of an array //the position of the index
				result = i;

			}
		}
		return result;

	}
}
