package java_Practice;

public class StringReverseByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java Automation Testing";

		String[] words = str.split(" ");

		String reverse = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reverse = reverse + words[i] + " ";
		}

		System.out.println(reverse);

	}

}
