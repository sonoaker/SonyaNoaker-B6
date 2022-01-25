package Day22Hw;

public class Q6hw {

	public static void main(String[] args) {
          Q6hw obj = new Q6hw();
		System.out.println(obj.endsWithNG(null));
		System.out.println(obj.endsWithNG("I like to practice"));
		System.out.println(obj.endsWithNG("Everyone is practicing"));
	    System.out.println(obj.endsWithNG("I am studying"));

	}

	public boolean endsWithNG(String strOne) {
		boolean result = false;

		if (strOne != null) {
			result = strOne.endsWith("ng");

		}
		return result;

	}
}
