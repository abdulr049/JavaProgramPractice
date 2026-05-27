package java_Practice;

public class Segregate0sand1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "101100101";

		int countOfZeros = 0;
		int countOfOnes = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0') {
				countOfZeros++;
			}

			else if (input.charAt(i) == '1') {
				countOfOnes++;
			}
		}

		for (int i = 0; i < countOfZeros; i++) {
			System.out.print("0");
		}

		for (int i = 0; i < countOfOnes; i++) {
			System.out.print("1");
		}
	}

}
