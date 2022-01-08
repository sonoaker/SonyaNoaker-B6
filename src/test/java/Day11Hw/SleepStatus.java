package Day11Hw;

public class SleepStatus {

	public static void main(String[] args) {

		boolean amISleeping = false;

		System.out.println(amISleeping);
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		boolean result = false;

		if (isWeekday == true) {
			result = false;
		} else if (isWeekday == false || isVacation == true) {
			result = true;
		}
		return result;
	}
}
