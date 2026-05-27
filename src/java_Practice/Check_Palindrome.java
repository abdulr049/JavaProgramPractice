package java_Practice;

public class Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("String is Palindrome :");
		}

		else {
			System.out.println("String is not Palindrome :");
		}
	}
}
