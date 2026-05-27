package java_Practice;

public class LargestAndSecondLargestNumber {

	int[] a = { 2, 8, 21, 9, 0, 2, 12 };

	int largest = a[0];;

	public void largestNumber() {

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest)

				largest = a[i];

		}

		System.out.println("Largest: " + largest);
	}

	public void secondLargest() {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i];
			}
		}

		System.out.println("Largest: " + largest);
		System.out.println("Second Largest: " + secondLargest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargestAndSecondLargestNumber number = new LargestAndSecondLargestNumber();
		number.largestNumber();
		number.secondLargest();

	}

}
