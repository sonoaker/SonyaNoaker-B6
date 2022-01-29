package Day24Hw;

public class Q6Hw {

	public static void main(String[] args) {

		int[] n1 = { 6, 1, 2, 3 };
		boolean result1 = checkNum(n1);
		System.out.println(result1);
		
		int[] n2= {13,2,3,4,6,1,2,3};
		boolean result2= checkNum(n2);
		System.out.println(result2);
		
		int[] n3 = {3,3,0,1,4,3,6};
		boolean result3= checkNum(n3);
		System.out.println(result3);
		
		int [] n4 = {2,6,2};
		boolean result4= checkNum(n4);
		System.out.println(result4);
		
	}

	static boolean checkNum(int[] number) {
		boolean result = false;
		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i < number.length; i++) {

			if (number[i] == 2) {
				num1 += 1;

			} else if (number[i] == 5) {
				num2 += 1;

			}
		}
		if (num1 > 1 || num2 > 1) {
			result = true;
		}
		return result;

	}

}

/**
 * Write a method that takes an array of int parameter and return true if the
 * array contains value 2 twice, or value 5 twice
 * 
 * 
 * Access Modifier:Protected Non-Access Modifier:static Return Type:boolean
 * Method Name: checkNum Parameter1: int []number
 * 
 * checknum - 6,1,2,3 false check num - 13,2,3,4,6,1,2,3 true check num -
 * 3,3,0,1,4,3,6, false check - 2,6,2
 */