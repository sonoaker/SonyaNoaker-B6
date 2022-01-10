package day10hw;

public class Homework2 {

	public static void main(String[] args) {

		getGender('f');
		getGender('M');
		getGender('Y');

	}

	public static void getGender(char gender) {
		if (gender == 'f' || gender == 'f') {
			System.out.println("Female");
		} else if (gender == 'm' || gender == 'M') {
			System.out.println("Male");
		} else {
			System.out.println("Wrong gender option...");
		}
	}
}
