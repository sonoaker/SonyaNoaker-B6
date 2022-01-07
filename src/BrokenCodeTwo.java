package homework;

public class BrokenCodeTwo {
	public static void main(String[] args) { // switched static & void & capitalized S in string
		double TempOne = 84.7; // changed data type from double
		double TempTwo = 66; // also changed data type

		Boolean result; // changed from string to boolean
		if (TempOne <= 0 && TempTwo >= 100) { /*
												 * applied camel case, removed &, switched placement of 2nd equal sign
												 * and removed double quotations from 100 because it was not needed
												 */
			result = true;
		} else if (TempOne >= 100 && TempTwo <= 0) { /*
														 * switched placement of else & if, camel case, and switched
														 * placement of 2nd equal sign, removed semicolon
														 */
			result = true;
		} else {
			result = false;
		}

		System.out.println("results"); // put results in quotation marks

		String season = "fall"; /*
								 * changed from Monday to fall , capitalized string
								 */
		switch (season) { // removed equal signs

		case "fall": // put double quotes & changed semicolon to colon
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");
			break;
		case "spring": // changed s to another season
			System.out.println("Recovering from cold weather");
			break;
		case "summer":
			System.out.println("Toooo hot");
			break;  //added one more break

		default: // changed semicolon to colon
			System.out.println("Season does not exist!");
		}

		for (int i = 0; i <= 10; i++) { // initialized & declared variable
		 if (i == 5) {
				System.out.println("i equals to 5"); // removed capital i
			} else { // removed parentheses
				System.out.println(" i is not equal to 5"); // changed wording because it didn't make sense
			}
		}

	}

} //removed extra closing brackets
