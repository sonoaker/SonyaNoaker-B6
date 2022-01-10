package day10hw;

public class Homework4 {

	public static void main (String [] args) {
		getDoWhileLoopResult(10,90);
	}
	public static void getDoWhileLoopResult(int minNUm, int maxNUm) {
		
		int i =10;
		
		do {
			System.out.println(i);
			i++;
		} while (i <=90);
	}
}
